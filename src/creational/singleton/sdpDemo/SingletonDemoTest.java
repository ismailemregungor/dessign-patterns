package creational.singleton.sdpDemo;

public class SingletonDemoTest {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            SingletonDemo singletonDemo = SingletonDemo.getSingletonBasicDemo();
        }
    }
}
