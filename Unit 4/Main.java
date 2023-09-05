public class main {
    public static void main(String[] args) {
        // A school called VLN located at Sesame is created and it is in district 1
        School school = new School(1, "VLN", "Sesame");

        // Adding 3 new teachers to the school called Sesame
        school.add_teacher(new Teacher("Bill", "Gates", "Programming"));
        school.add_teacher(new Teacher("Elon", "Musk", "Science"));
        school.add_teacher(new Teacher("Cillian", "Murphy", "Drama"));

        // Adding 10 new students to the school called Sesame
        school.add_student(new Student("Timothy", "Chiang", 12));
        school.add_student(new Student("Ema", "Mlinar", 12));
        school.add_student(new Student("Charlie", "Brown", 7));
        school.add_student(new Student("Susie", "Derkins", 1));
        school.add_student(new Student("Lucy", "Pelt", 2));
        school.add_student(new Student("Sally", "Brown", 1));
        school.add_student(new Student("Linus", "Pelt", 3));
        school.add_student(new Student("Robert", "Downey", 11));
        school.add_student(new Student("Sherlock", "Holmes", 10));
        school.add_student(new Student("Mary", "Watson", 9));

        // Display the teacher list and student list
        System.out.println("These are the teachers: ");
        school.show_teachers();
        System.out.println("\nThese are the students: ");
        school.show_student();

        System.out.println("------------------------------------------");

        // Remove 2 students from the school by first name
        school.del_student("Lucy");
        school.del_student("Timothy");

        // Remove 1 teacher from the school by first name
        school.del_teacher("Bill");

        // New lists of students and teachers
        System.out.println("These are the new students");
        school.show_student();
        System.out.println("\nThese are the new teachers");
        school.show_teachers();
    }
}