package examples.design_pattern.abstract_factory.Factory.extend;

import examples.design_pattern.abstract_factory.Shapes.Shape;
import examples.design_pattern.abstract_factory.Enums.ShapesEnum;
import examples.design_pattern.abstract_factory.Factory.AbstractFactory;
import examples.design_pattern.abstract_factory.Shapes.impl.Circle;
import examples.design_pattern.abstract_factory.Shapes.impl.Rectangle;
import examples.design_pattern.abstract_factory.Shapes.impl.Square;
import examples.design_pattern.abstract_factory.Colors.Color;
import examples.design_pattern.abstract_factory.Enums.ColorEnum;


public class ShapeFactory extends AbstractFactory {

    @Override
	public Shape getShape(ShapesEnum type) {
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

    @Override
    public Color getColor(ColorEnum colorEnum) {
        return null;
    }
}
