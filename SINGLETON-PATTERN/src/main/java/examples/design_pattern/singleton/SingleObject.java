package examples.design_pattern.singleton;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class SingleObject {

    private SingleObject(){

    }

    private static SingleObject instance = new SingleObject();

    private String testField;

    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hi");
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
