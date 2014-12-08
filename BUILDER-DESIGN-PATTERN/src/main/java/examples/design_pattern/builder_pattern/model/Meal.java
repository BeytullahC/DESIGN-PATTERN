package examples.design_pattern.builder_pattern.model;

import examples.design_pattern.builder_pattern.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Meal {

    private List<Item> items= new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item:items){

            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packaging().pack());
            System.out.println(", Price : "+item.price());

        }
    }
}
