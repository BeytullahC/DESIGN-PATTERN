package examples.design_pattern.abstract_factory;

import examples.design_pattern.abstract_factory.Enums.FactoryEnum;
import examples.design_pattern.abstract_factory.Factory.AbstractFactory;
import examples.design_pattern.abstract_factory.Factory.extend.ColorFactory;
import examples.design_pattern.abstract_factory.Factory.extend.ShapeFactory;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryEnum anEnum){
        if(anEnum== FactoryEnum.SHAPE){
           return new ShapeFactory();
        }else if (anEnum== FactoryEnum.COLOR){
           return new ColorFactory();
        }
        return null;
    }
}
