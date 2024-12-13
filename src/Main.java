//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car suzuki = new Car("Suzuki");
        suzuki.startEngine();
        suzuki.drive();

        Car bmw = new GasPoweredCar("BMW", 12, 6);
        bmw.startEngine();
        bmw.drive();

        Car tesla = new ElectricCar("Tesla", 320, 38);
        tesla.startEngine();
        tesla.drive();

        Car audi = new HybridCar("Audi", 20, 16, 6);
        audi.startEngine();
        audi.drive();
    }
}