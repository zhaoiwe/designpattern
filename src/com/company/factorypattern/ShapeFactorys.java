package com.company.factorypattern;

/**
 * Created by Administrator on 2018/3/10.
 * 多个工厂模式对普通工厂模式的改进
 */
public class ShapeFactorys {

    public Shape getCircle(){
        return new Circle();
    }

    /**
     * 静态工厂模式
     * @return
     */
    public static Shape getRectangle(){
        return new Rectangle();
    }

    public Shape getSquare(){
        return new Square();
    }
}
