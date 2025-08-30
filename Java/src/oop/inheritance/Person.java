package oop.inheritance;

public class Person {
    private String firstName, lastName, gender;
    private int age;

    Person (String firstName, String lastName, String gender, int age){
        this.firstName= firstName;
        this.lastName= lastName;
        this.gender= gender;
        this.age= age;

    }

    void introduceSelf(){
        System.out.printf("Hi, I'm %s %s! I'm %s and I'm already %d years old.%n",
                firstName, lastName, gender, age);
    }
}
