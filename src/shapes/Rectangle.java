package shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double length, breadth;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public void display() {
        System.out.println("The area of rectangle is: " + calculateArea());
    }
}
