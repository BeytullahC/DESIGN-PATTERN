package examples.design_pattern.prototype_pattern.model;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Square extends Shape {
    public Square() {
        type=ShapeEnum.SQUARE;
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
