package examples.design_pattern.builder_pattern.model;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public interface Item {
    public String name();
    public Packaging packaging();
    public float price();
}
