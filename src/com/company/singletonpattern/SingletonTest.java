package com.company.singletonpattern;

/**
 * Created by Administrator on 2018/3/10.
 */
public class SingletonTest {

    public static  void main(String[] args){
        SingletonDemo singletonDemo = SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo1 = SingletonDemo.getSingletonDemo();
        System.out.println(singletonDemo);
        System.out.println(singletonDemo1);

    }
}
