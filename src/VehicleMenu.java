import java.util.Scanner;

interface VehicleOp {
    void start();
    void stop();
    void showDetails();
}

class TransportOp {
    protected String brand;
    protected int speed;

    public TransportOp(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class CarOp extends TransportOp implements VehicleOp {
    public CarOp(String brand, int speed){
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

    @Override
    public void showDetails() {
        System.out.println("Car - Brand: " + brand + ", Speed: " + speed);
    }
}

class BikeOp extends TransportOp implements VehicleOp {
    public BikeOp(String brand, int speed){
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

    @Override
    public void showDetails() {
        System.out.println("Bike - Brand: " + brand + ", Speed: " + speed);
    }
}

public class VehicleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Vehicle Management Menu ===");
            System.out.println("1. Add Car");
            System.out.println("2. Add Bike");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            String brand;
            int speed;
            VehicleOp vehicle;

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Brand: ");
                    brand = scanner.nextLine();
                    System.out.print("Enter Car Speed: ");
                    speed = scanner.nextInt();
                    vehicle = new CarOp(brand, speed);
                    vehicle.showDetails();
                    vehicle.start();
                    vehicle.stop();
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    brand = scanner.nextLine();
                    System.out.print("Enter Bike Speed: ");
                    speed = scanner.nextInt();
                    vehicle = new BikeOp(brand, speed);
                    vehicle.showDetails();
                    vehicle.start();
                    vehicle.stop();
                    break;

                case 3:
                    System.out.println("Exiting Vehicle Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
