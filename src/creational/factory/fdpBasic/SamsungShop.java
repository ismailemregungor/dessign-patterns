package creational.factory.fdpBasic;

public class SamsungShop {

    public static void main(String[] args) {

        SamsungGalaxyPhone S8 =  SamsungFactory.getSamsungGalaxyPhone("SamsungGalaxyS8","5000mAh", 4,6);
        SamsungGalaxyPhone Note8 = SamsungFactory.getSamsungGalaxyPhone("SamsungGalaxyNote8","6500mAh", 5,8);

        System.out.println("Samsung Galaxy S8");
        System.out.println(S8);
        System.out.println("Samsung Galaxy Note8");
        System.out.println(Note8);
    }

}
