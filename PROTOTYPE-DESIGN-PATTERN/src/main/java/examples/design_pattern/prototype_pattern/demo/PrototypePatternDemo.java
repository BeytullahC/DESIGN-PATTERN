package examples.design_pattern.prototype_pattern.demo;

import examples.design_pattern.prototype_pattern.cache.ShapeCache;
import examples.design_pattern.prototype_pattern.model.Shape;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */

public class PrototypePatternDemo {


    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");

        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");

        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");

        System.out.println("Shape : " + clonedShape3.getType());

    }

}

