package com.company.factorypattern;

/**
 * 形状接口的实现类 长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("形状画出矩形.");
    }
}
