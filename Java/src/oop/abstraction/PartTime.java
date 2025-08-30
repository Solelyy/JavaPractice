package oop.abstraction;

public class PartTime extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTime (String name, int employeeId, double hourlyRate, int hoursWorked){
        super(name,employeeId);
        this.hoursWorked= hoursWorked;
        this.hourlyRate= hourlyRate;
    }

    @Override
    double calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        return salary;
    }
}
