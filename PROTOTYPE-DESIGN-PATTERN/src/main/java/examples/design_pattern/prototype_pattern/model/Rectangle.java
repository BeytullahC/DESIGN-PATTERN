package examples.design_pattern.prototype_pattern.model;


import examples.design_pattern.prototype_pattern.model.Shape;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Rectangle extends Shape{

    public Rectangle() {
        type = ShapeEnum.RECTANGLE;
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }
}
