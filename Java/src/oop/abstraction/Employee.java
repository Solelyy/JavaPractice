package oop.abstraction;

public abstract class Employee {
    String name;
    int employeeId;

    Employee (String name, int employeeId) {
        this.name=  name;
        this.employeeId= employeeId;
    }
    abstract double calculateSalary();

    void showInfo(){
        double salary= calculateSalary();
        System.out.printf("Employee Info:%nEmployee Id: %d%nEmployee Name: %s%n" +
                "Salary: %.2f", employeeId, name, salary);
    }
}
