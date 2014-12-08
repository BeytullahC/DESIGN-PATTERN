package examples.design_pattern.builder_pattern.demo;

import examples.design_pattern.builder_pattern.builder.MealBuilder;
import examples.design_pattern.builder_pattern.model.Meal;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }

}
