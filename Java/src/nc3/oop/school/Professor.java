package nc3.oop.school;

public class Professor extends Person implements Payable {
    private Department department;
    private Salary salary;

    public Professor(String firstName, String lastName, Department department, Salary salary) {
        super(firstName, lastName);
        this.department = department;
        this.salary = salary;
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
                """.formatted(getFullName(), department.getDepartment());
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hello, I am %s!".formatted(getFullName()));
    }

    @Override
    public double computeSalary() {
        return salary.getAmount();
    }
}
