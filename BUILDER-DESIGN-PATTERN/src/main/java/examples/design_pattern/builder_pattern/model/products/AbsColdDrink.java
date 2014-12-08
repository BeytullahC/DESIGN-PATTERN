package examples.design_pattern.builder_pattern.model.products;

import examples.design_pattern.builder_pattern.model.Item;
import examples.design_pattern.builder_pattern.model.Packaging;
import examples.design_pattern.builder_pattern.model.impl.Bottle;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public abstract class AbsColdDrink implements Item {

    @Override
    public Packaging packaging() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
