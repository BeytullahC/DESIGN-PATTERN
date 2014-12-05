package examples.design_pattern.abstract_factory;

import examples.design_pattern.abstract_factory.Enums.ColorEnum;
import examples.design_pattern.abstract_factory.Enums.FactoryEnum;
import examples.design_pattern.abstract_factory.Enums.ShapesEnum;
import examples.design_pattern.abstract_factory.Factory.AbstractFactory;
import examples.design_pattern.abstract_factory.Shapes.Shape;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("---------- WELCOME TO FACTORIES ---------");

        System.out.println("\n---SHAPE FACTORY---\n");
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE);
        shapeFactory.getShape(ShapesEnum.SQUARE).draw();
        shapeFactory.getShape(ShapesEnum.CIRCLE).draw();
        shapeFactory.getShape(ShapesEnum.RECTANGLE).draw();

        System.out.println("\n---COLOR FACTORY---\n");
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR);
        colorFactory.getColor(ColorEnum.RED).fill();
        colorFactory.getColor(ColorEnum.BLUE).fill();
        colorFactory.getColor(ColorEnum.GREEN).fill();

    }
}
