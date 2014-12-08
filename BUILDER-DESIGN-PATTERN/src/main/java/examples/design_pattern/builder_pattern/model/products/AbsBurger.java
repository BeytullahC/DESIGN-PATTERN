package examples.design_pattern.builder_pattern.model.products;

import examples.design_pattern.builder_pattern.model.Item;
import examples.design_pattern.builder_pattern.model.Packaging;
import examples.design_pattern.builder_pattern.model.impl.Wrapper;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public abstract class AbsBurger implements Item {
    @Override
    public Packaging packaging() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
