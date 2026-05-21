package nc3.oop.school;

public class Professor extends Person implements Payable {
    private String department;
    private double monthlySalary;

    public Professor(String firstName, String lastName, String department, double monthlySalary) {
        super(firstName, lastName);
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getFullName() {
        return "Prof. " + super.getFullName();
    }

    @Override
    public String toString() {
        return """
                Professor
                Name        : %s
                Department  : %s
                """.formatted(getFullName(), getDepartment());
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hello, I am %s!".formatted(getFullName()));
    }

    @Override
    public double computeSalary() {
        return monthlySalary;
    }
}
