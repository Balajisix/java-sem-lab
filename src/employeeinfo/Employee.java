package employeeinfo;

import personinfo.Person;

public class Employee extends Person {
    private String dept;
    private double salary;

    public Employee(String name, int age, String dept, double salary) {
        super(name, age);
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }
}
