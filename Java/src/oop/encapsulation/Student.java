package oop.encapsulation;

public class Student {
    private String firstName, lastName;
    private String course, section;
    private int year;

    Student (String firstName, String lastName, String course, String section, int year) {
        this.firstName=firstName;
        this.lastName= lastName;
        this.course= course;
        this.section= section;
        this.year= year;
    }

    public String getFirstName (){ return firstName; }
    public void setFirstName (String firstName) { this.firstName = firstName;}

    public String getLastName (){ return lastName; }
    public void setLastName (String lastName) { this.lastName = lastName;}

    public String getCourse (){ return course; }
    public void setCourse (String course) { this.course = course;}

    public String getSection (){ return section; }
    public void setSection (String section) { this.section = section;}

    public int getYear (){ return year; }
    public void setYear (int year) { this.year = year;}

    public void displayInfo(){
        System.out.printf("Name: %s%s%nCourse: %s%nYear: %d%nSection: %s",
                firstName, lastName, course, year, section);
    }
}
