package creational.singleton.sdpBasic;

public class SingletonBasic {

    private static SingletonBasic singletonBasic = new SingletonBasic();

    private SingletonBasic() {
        System.out.println("Nesne oluştu!");
    }

    public static SingletonBasic getSingleton() {
        return singletonBasic;
    }
}
