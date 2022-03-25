package creational.singleton.sdpBasicDemo;

public class SingletonBasicDemo {

    private static SingletonBasicDemo singletonBasicDemo = new SingletonBasicDemo();
    private static int counter = 0;

    private SingletonBasicDemo() {
        System.out.println("Nesne oluştu!");
    }

    public static SingletonBasicDemo getSingletonBasicDemo() {
        counter++;
        System.out.println(counter);
        return singletonBasicDemo;
    }
}
