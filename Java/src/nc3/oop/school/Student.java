package nc3.oop.school;

public class Student extends Person {
    private String course;
    private byte year;
    //add student number

    public Student(String firstName, String lastName, String course, byte year) {
        super(firstName, lastName);
        this.course = course;
        setYear(year);
    }

    public String getFormattedYear() {
        return switch (year) {
             case 1 -> "1st";
             case 2 -> "2nd";
             case 3 -> "3rd";
             case 4 -> "4th";
             default -> "Invalid";
        };
    }

    public String getCourse() {
        return course;
    }

    public static String getSchool() {
        return school;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(byte year) {
        if (year < 1 || year > 4) {
            System.out.println("Invalid year.");
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return """
                Student
                Name           : %s        
                Course & Year  : %s - %s
                """.formatted(getFullName(), getCourse(), getFormattedYear());
    }

    @Override
    public void introduceSelf() {
        System.out.println("Hello, I am %s! I am currently %s year %s student!"
                .formatted(getFullName(), getFormattedYear(), getCourse()));
    }
}
