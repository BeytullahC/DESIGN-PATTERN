package examples.design_pattern.abstract_factory.Factory.extend;

import examples.design_pattern.abstract_factory.Colors.Color;
import examples.design_pattern.abstract_factory.Enums.ColorEnum;
import examples.design_pattern.abstract_factory.Factory.AbstractFactory;
import examples.design_pattern.abstract_factory.Shapes.Shape;
import examples.design_pattern.abstract_factory.Enums.ShapesEnum;
import examples.design_pattern.abstract_factory.Colors.impl.Blue;
import examples.design_pattern.abstract_factory.Colors.impl.Green;
import examples.design_pattern.abstract_factory.Colors.impl.Red;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class ColorFactory extends AbstractFactory{


    @Override
    public Shape getShape(ShapesEnum shapesEnum) {
        return null;
    }

    @Override
    public Color getColor(ColorEnum colorEnum) {
        if(colorEnum==ColorEnum.BLUE)
            return new Blue();
        if(colorEnum==ColorEnum.GREEN)
            return new Green();
        if(colorEnum==ColorEnum.RED)
            return new Red();
        return null;
    }
}
