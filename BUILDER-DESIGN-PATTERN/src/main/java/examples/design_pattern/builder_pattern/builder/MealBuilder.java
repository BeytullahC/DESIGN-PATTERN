package examples.design_pattern.builder_pattern.builder;

import examples.design_pattern.builder_pattern.model.Meal;
import examples.design_pattern.builder_pattern.model.products.Drinks.Coke;
import examples.design_pattern.builder_pattern.model.products.Drinks.Pepsi;
import examples.design_pattern.builder_pattern.model.products.burgers.ChickenBurger;
import examples.design_pattern.builder_pattern.model.products.burgers.VegBurger;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;

    }

    public Meal prepareNonVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;

    }
}