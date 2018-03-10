package com.company.singletonpattern;

/**
 * Created by Administrator on 2018/3/10.
 * 饿汉式 ，在类初始化时就实例化自己
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 * 饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例，都会占据一定的内存，
 * 但是相应的，在第一次调用时速度也会更快，因为其资源已经初始化完成，
 * 饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了，
 */
public class Singleton {

    /**
     * 私有化构造方法，防止被外部调用创建对象
     */
    private  Singleton(){}

    /**
     * 内部实例化
     */
    private static final Singleton singleton=new Singleton();

    /**
     * 通过给的公共静态方法访问
     * @return
     */
    public static  Singleton getSingleton(){
        return singleton;
    }
}
