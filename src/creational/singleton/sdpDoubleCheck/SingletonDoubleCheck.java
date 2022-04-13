package creational.singleton.sdpDoubleCheck;

public class SingletonDoubleCheck {

    private static SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck() {
        System.out.println("Nesne oluştu!");
    }

    public static SingletonDoubleCheck getSingletonDoubleCheck() {
        if(singletonDoubleCheck == null){
            synchronized (SingletonDoubleCheck.class){
                if (singletonDoubleCheck == null){
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
