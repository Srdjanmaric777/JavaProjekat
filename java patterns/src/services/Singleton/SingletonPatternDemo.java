package services.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        object.showMessage();
        object2.showMessage();

        System.out.println(Integer.toHexString(System.identityHashCode(object)));
        System.out.println(Integer.toHexString(System.identityHashCode(object2)));
    }
}
