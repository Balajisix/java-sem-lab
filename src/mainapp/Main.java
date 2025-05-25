package mainapp;

import info.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter the roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the course: ");
        String course = sc.nextLine();

        Student st = new Student(name, rollNo, course);
        st.displayDetails();

        sc.close();
    }
}
