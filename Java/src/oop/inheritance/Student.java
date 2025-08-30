package oop.inheritance;

public class Student extends Person {
    String course, school;

    Student (String firstName, String lastName, String gender, int age, String school, String course){
        super (firstName, lastName, gender, age);

        this.course= course;
        this.school= school;
    }

    @Override
    void introduceSelf() {
        super.introduceSelf();
        System.out.printf("I'm studying at %s, pursuing %s!%n", school, course);
    }
}
