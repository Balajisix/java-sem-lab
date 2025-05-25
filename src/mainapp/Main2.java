package mainapp;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;

        System.out.println("Shape Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        shape.input();
        shape.display();
        sc.close();
    }
}
