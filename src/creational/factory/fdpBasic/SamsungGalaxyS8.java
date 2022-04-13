package creational.factory.fdpBasic;

public class SamsungGalaxyS8 implements SamsungGalaxyPhone {

    private String model;
    private String battery;
    private int height;
    private int width;

    public SamsungGalaxyS8(String model, String battery, int height, int width) {
        this.model = model;
        this.battery = battery;
        this.height = height;
        this.width = width;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public String toString() {
        return "SamsungGalaxyS8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
