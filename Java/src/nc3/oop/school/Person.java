package nc3.oop.school;

public abstract class Person {
    private String firstName, lastName;
    public static final String school = "QCU";

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public abstract void introduceSelf();
}

