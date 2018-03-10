package com.company.factorypattern;

/**
 * Created by Administrator on 2018/3/10.
 */
public class WithleCarfactory implements  AbstractFactory{
    @Override
    public Car produce() {
        return new WithleCar();
    }
}
