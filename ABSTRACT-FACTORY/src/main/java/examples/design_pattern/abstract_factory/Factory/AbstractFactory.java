package examples.design_pattern.abstract_factory.Factory;

import examples.design_pattern.abstract_factory.Shapes.Shape;
import examples.design_pattern.abstract_factory.Enums.ShapesEnum;
import examples.design_pattern.abstract_factory.Colors.Color;
import examples.design_pattern.abstract_factory.Enums.ColorEnum;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public abstract class AbstractFactory {
    public  abstract  Shape getShape(ShapesEnum shapesEnum);
    public abstract Color getColor(ColorEnum colorEnum);
}
