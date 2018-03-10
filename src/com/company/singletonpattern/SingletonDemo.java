package com.company.singletonpattern;

/**
 * Created by Administrator on 2018/3/10.
 * 单例模式 懒汉式单例类.在第一次调用的时候实例化自己
 * 懒汉式单例类没有考虑线程安全问题，线程不安全
 * 并发环境下很可能出现多个Singleton实例
 *懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，
 * 第一次调用时要做初始化，如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
 * 懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例
 */
public class SingletonDemo {

    /**
     * 私有化静态对象属性
      *赋值空为了延迟加载
     */
    private static SingletonDemo singletonDemo=null;

    /**
     * 私有化构造方法，防止类在外部被实例化
     * 但是通过Java反射机制是能够实例化构造方法为private的类的，
     */
    private  SingletonDemo(){}

    /**
     * 通过提供的静态工厂方法创建对象
     * 同一个虚拟机范围内，SingletonDemo的唯一实例只能通过getSingletonDemo()方法访问
     * @return
     */
    public  static SingletonDemo getSingletonDemo(){
        if(singletonDemo==null){
            singletonDemo= new SingletonDemo();
        }
        return  singletonDemo;
    }


    /**
     * 对赖汉式进行改造成线程安全
     * 在方法上同步，每次创建对象都要加锁，性能下降
     * 在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的
     */
    public static synchronized  SingletonDemo getSingletonDemoSynchronized (){
        if(singletonDemo==null){
            singletonDemo=new SingletonDemo();
        }
        return singletonDemo;
    }

    /**
     * 在需要加锁的地方进行加锁，创建对象时加锁，不需要创建对象不加锁，提高性能
     *  synchronized (singletonDemo.class)
     *   synchronized (singletonDemo)
     *   在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
     */

    public static  SingletonDemo getInstance() {
        if (singletonDemo == null) {
            synchronized (singletonDemo) {
                if (singletonDemo == null) {
                    singletonDemo=new SingletonDemo();
                }

            }
        }
        return singletonDemo;
    }


    /**
     * 静态内部类方法解决线程安全
     * 比加锁好既实现了线程安全，又避免了同步带来的性能影响。
     * 利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗，所以一般我倾向于使用这一种
     */
   private static class Singleton{
        private static final SingletonDemo singletonDemo=new SingletonDemo();

    }

    public static SingletonDemo getInstanceStatic(){
       return Singleton.singletonDemo;
    }
}
