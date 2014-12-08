package examples.design_pattern.builder_pattern.model.products.burgers;

import examples.design_pattern.builder_pattern.model.products.AbsBurger;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class VegBurger extends AbsBurger {

    @Override
    public float price() {

        return 25.0f;

    }

    @Override
    public String name() {

        return "Veg Burger";

    }

}