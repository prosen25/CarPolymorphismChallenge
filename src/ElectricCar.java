public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> %d KW battery is installed!%n", getBatterySize());
    }

    @Override
    public void runEngine() {
        System.out.printf("Electric -> usage exceeds the average: %.2f %n", getAvgKmPerCharge());
    }
}
