package mainapp;

import employeeinfo.Employee;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== EMPLOYEE REGISTRATION ===");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee em = new Employee(name, age, dept, salary);

        System.out.println("=== EMPLOYEE DETAILS ===");
        em.display();

        sc.close();
    }
}
