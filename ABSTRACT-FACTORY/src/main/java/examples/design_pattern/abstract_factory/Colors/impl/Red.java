package examples.design_pattern.abstract_factory.Colors.impl;

import examples.design_pattern.abstract_factory.Colors.Color;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red fill() method.");
    }
}
