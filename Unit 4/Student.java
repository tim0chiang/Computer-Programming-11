public class Student {
    // The information about the student (Field)
    String firstName;
    String lastName;
    int grade;
    static int studentNumber = 1;
    int idNum;

    // If the user does not give any information about the student
    Student() {
        firstName = "";
        lastName = "";
        grade = 9;
        idNum = studentNumber;
        studentNumber++;
    }
    // Student Constructor
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = studentNumber;
        studentNumber++;
    }
    // Getters/setters
    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}