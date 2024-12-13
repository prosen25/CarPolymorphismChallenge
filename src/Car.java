public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine method");
    }

    public void drive() {
        System.out.println("Car -> drive method, type is " + getClass().getSimpleName());
        runEngine();

    }

    protected void runEngine() {
        System.out.println("Car -> runEngine method");
    }
}
