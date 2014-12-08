package examples.design_pattern.builder_pattern.model.impl;

import examples.design_pattern.builder_pattern.model.Packaging;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Bottle implements Packaging {
    @Override
    public String pack() {
        return "Bottle";
    }
}
