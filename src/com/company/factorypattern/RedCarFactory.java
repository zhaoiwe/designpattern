package com.company.factorypattern;

/**
 * Created by Administrator on 2018/3/10.
 * 工厂实现类，实现具体的颜色的汽车
 */
public class RedCarFactory implements AbstractFactory  {
    @Override
    public Car produce() {
        return new RedCar();
    }
}
