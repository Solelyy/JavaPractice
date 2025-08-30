package oop.inheritance;

public class Graduate extends Student {
    int graduation;
    Graduate(String firstName, String lastName, String gender, int age, String school, String course, int graduationYear){
        super (firstName, lastName, gender, age, school, course);
        this.graduation= graduationYear;
    }

    @Override
    void introduceSelf() {
        super.introduceSelf();
        System.out.printf("I %s %d!", graduation < java.time.Year.now().getValue() ? "graduated last" :
                "will graduate in", graduation);
    }
}
