package shapes;

import java.util.Scanner;

public class Circle implements Shape {
    private double radius;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle area = " + calculateArea());
    }
}
