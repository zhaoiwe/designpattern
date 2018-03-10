package com.company.factorypattern;



/**
 * 创建一个形状工厂,普通工厂模式
 */
public class ShapeFactory {

    /**
     *
     * @param
     * @return
     */
    public Shape getShape(String shapeType){

        if(shapeType==null){
           return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
               return  new Circle();
           }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
