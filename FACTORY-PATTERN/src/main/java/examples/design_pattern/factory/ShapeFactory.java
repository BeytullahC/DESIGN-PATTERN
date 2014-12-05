package examples.design_pattern.factory;

import examples.design_pattern.factory.Shapes.Shape;
import examples.design_pattern.factory.Shapes.impl.Circle;
import examples.design_pattern.factory.Shapes.impl.Rectangle;
import examples.design_pattern.factory.Shapes.impl.Square;

public class ShapeFactory {

	public static Shape getShape(ShapesEnum type) {
		if (type == null) {
			return null;
		}
		
		if (type == ShapesEnum.CIRCLE) {
            return new Circle();
		} else if (type == ShapesEnum.SQUARE) {
			return new Square();
		} else if (type == ShapesEnum.RECTANGLE) {
			return new Rectangle();
		}
		
		return null;
	}
}
