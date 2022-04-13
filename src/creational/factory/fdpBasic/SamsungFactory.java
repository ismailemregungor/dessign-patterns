package creational.factory.fdpBasic;

public class SamsungFactory {

    public static SamsungGalaxyPhone getSamsungGalaxyPhone(String model, String battery, int height, int width){

        SamsungGalaxyPhone samsungGalaxyPhone;

        if("SamsungGalaxyS8".equalsIgnoreCase(model)){
            samsungGalaxyPhone = new SamsungGalaxyS8(model, battery, height, width);
        }else if ("SamsungGalaxyNote8".equalsIgnoreCase(model)) {
            samsungGalaxyPhone = new SamsungGalaxyNote8(model, battery, height, width);
        }else{
            throw new RuntimeException("geçerli bir model değildir!");
        }
        return samsungGalaxyPhone;
    }
}
