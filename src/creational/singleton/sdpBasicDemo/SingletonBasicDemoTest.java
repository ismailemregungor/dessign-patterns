package creational.singleton.sdpBasicDemo;

public class SingletonBasicDemoTest {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            SingletonBasicDemo singletonBasicDemo = SingletonBasicDemo.getSingletonBasicDemo();
        }
    }
}
