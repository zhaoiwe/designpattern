package com.company.factorypattern;

/**
 * Created by Administrator on 2018/3/10.
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        /**
         * 多个工厂模式，工厂模式改进测试
         */

        ShapeFactorys shapeFactorys=new ShapeFactorys();
        Shape circle1 = shapeFactorys.getCircle();
        circle1.draw();


        /**
         * 静态工厂模式测试
         *
         *
         */
        Shape rectangle1 = ShapeFactorys.getRectangle();
        rectangle1.draw();
        /**
         * 抽象工厂类测试
         *
         */
       AbstractFactory abstractFactory = new RedCarFactory();
            Car car= abstractFactory.produce();
        car.carColor();

    }




}
