package examples.design_pattern.prototype_pattern.model;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public abstract class Shape implements Cloneable {

    public String id;
    protected ShapeEnum type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShapeEnum getType() {
        return type;
    }

    public void setType(ShapeEnum type) {
        this.type = type;
    }

    public Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace(System.err);
        }
        return clone;
    }
}
