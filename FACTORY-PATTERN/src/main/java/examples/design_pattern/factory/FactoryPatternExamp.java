package examples.design_pattern.factory;

import examples.design_pattern.factory.Shapes.Shape;

public class FactoryPatternExamp {
	public static void main(String[] args) {
		
		Shape shape = ShapeFactory.getShape(ShapesEnum.CIRCLE);
		shape.draw();
		
		Shape shape2 = ShapeFactory.getShape(ShapesEnum.SQUARE);
		shape2.draw();
		
		Shape shape3 = ShapeFactory.getShape(ShapesEnum.RECTANGLE);
		shape3.draw();
		
	}
}
