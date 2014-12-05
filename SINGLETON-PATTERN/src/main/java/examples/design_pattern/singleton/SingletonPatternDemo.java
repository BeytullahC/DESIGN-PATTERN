package examples.design_pattern.singleton;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by BeytullahCaliskan on 05.12.2014.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getInstance();
        System.out.println("\n");
        singleObject.showMessage();
        System.out.println("\n");
        SingleObject singleObject2 = SingleObject.getInstance();
        System.out.println("singleObject Ref  : "+singleObject);
        System.out.println("singleObject2 Ref : "+singleObject2);
        System.out.println("singleObject.setTestField(\"TEST DATA\");");
        singleObject.setTestField("TEST DATA");
        System.out.println("singleObject.getTestField()  = " +
                singleObject.getTestField());
        System.out.println("singleObject2.getTestField() = "+
                singleObject2.getTestField());

    }

}
