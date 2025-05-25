interface Vehicle {
    void start();
    void stop();
}

class Transport {
    protected String brand;
    protected int speed;

    public Transport(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Transport implements Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Car Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopping...");
    }
}

class Bike extends Transport implements Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Bike Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopping...");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", 170);
        Vehicle bike = new Bike("Mercedes Benz", 220);

        System.out.println("=== Car Details ===");
        ((Car) car).showDetails();
        car.start();
        car.stop();

        System.out.println("\n=== Bike Details ===");
        ((Bike) bike).showDetails();
        bike.start();
        bike.stop();
    }
}
