package examples.design_pattern.builder_pattern.model.products.Drinks;

import examples.design_pattern.builder_pattern.model.products.AbsColdDrink;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Pepsi extends AbsColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
