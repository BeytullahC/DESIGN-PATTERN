package examples.design_pattern.abstract_factory.Shapes.impl;

import examples.design_pattern.abstract_factory.Shapes.Shape;

public class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square draw() method.");
    }

}
