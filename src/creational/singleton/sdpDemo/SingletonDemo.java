package creational.singleton.sdpDemo;

public class SingletonDemo {

    private static SingletonDemo singletonDemo = new SingletonDemo();
    private static int counter = 0;

    private SingletonDemo() {
        System.out.println("Nesne oluştu!");
    }

    public static SingletonDemo getSingletonBasicDemo() {
        counter++;
        System.out.println(counter);
        return singletonDemo;
    }
}
