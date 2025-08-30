package oop.abstraction;

public class FullTime extends Employee {
    double monthlyRate;

    FullTime (String name, int employeeId, double monthlyRate) {
        super(name, employeeId);
        this.monthlyRate= monthlyRate;
    }

    @Override
    double calculateSalary() {
        double salary = monthlyRate;
        return salary;
    }
}