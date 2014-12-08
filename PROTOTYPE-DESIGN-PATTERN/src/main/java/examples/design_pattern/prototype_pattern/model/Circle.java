package examples.design_pattern.prototype_pattern.model;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Circle extends Shape {

    public Circle() {
        type = ShapeEnum.CIRCLE;
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
