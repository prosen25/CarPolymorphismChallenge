public class HybridCar extends Car {

    private double avgKmPerLirte;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLirte, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLirte = avgKmPerLirte;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLirte() {
        return avgKmPerLirte;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d KW battery is installed and %d cylinders are ready!%n", getBatterySize(), getCylinders());
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", getAvgKmPerLirte());
    }
}
