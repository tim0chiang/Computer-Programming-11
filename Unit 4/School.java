import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class School {
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
    int district;
    String school_name;
    String location;
    School(int district, String school_name, String location) {
        this.district = district;
        this.school_name = school_name;
        this.location = location;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    // Add, delete, and show teacher
    public void add_teacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void del_teacher(String firname) {
        for (int y=0; y<teachers.size(); y++) {
            if (Objects.equals(teachers.get(y).getFirstName(), firname)) {
                teachers.remove(y);
            }
        }
    }
    // Print all the teachers in the school with the subject that they are teaching
    public void show_teachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + ", " + teacher.getSubject());
        }
    }
    // Add, delete(Delete by getting first name of the student and finding that student and deleting them), and show student
    public void add_student(Student student) {
        students.add(student);
    }
    public void del_student(String firname) {
        for (int y=0; y<students.size(); y++) {
            if (Objects.equals(students.get(y).getFirstName(), firname)) {
                students.remove(y);
            }
        }
    }

    // Print all the students in the school
    public void show_student() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    // getter and setter for district
    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    // getter and setter for school name
    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    // getter and setter for location of the school
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}