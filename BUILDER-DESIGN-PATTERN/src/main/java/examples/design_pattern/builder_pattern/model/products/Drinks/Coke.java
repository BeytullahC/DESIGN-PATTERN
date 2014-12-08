package examples.design_pattern.builder_pattern.model.products.Drinks;

import examples.design_pattern.builder_pattern.model.products.AbsColdDrink;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Coke extends AbsColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
