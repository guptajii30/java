package myPack.famt.StudentApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class StudentMainApplication implements CommandLineRunner {

    private final StudentDAO studentDAO;

    public StudentMainApplication(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentMainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Retrieve all students with courses
        Map<Integer, Student> studentsWithCourses = studentDAO.getAllStudentsWithCourses();

        // Check if the map contains students
        if (!studentsWithCourses.isEmpty()) {
            System.out.println("Students and their respective courses:");
            // Loop through the map to display student and course information
            studentsWithCourses.forEach((id, student) -> {
                System.out.println("Student ID: " + student.getStudId());
                System.out.println("Course ID: " + student.getCourseId());

                // Access course details via student.getCourse()
                Coures course = student.getCourse();  // Use the correct 'Course' class
                if (course != null) {
                    System.out.println("Course Name: " + course.getCourseName());
                    System.out.println("Start Date: " + course.getStartDate());
                } else {
                    System.out.println("Course details not available.");
                }

                System.out.println("------------------------------------------");
            });
        } else {
            System.out.println("No student data found.");
        }

        // Retrieve a student by name
        String name = "John Doe";
        Student student = studentDAO.getStudentByName(name);

        // Check if the student was found
        if (student != null) {
            System.out.println("Student Found: " + student.getName() + ", Credits: " + student.getCourse().getCredits());
        } else {
            System.out.println("No student found with the name: " + name);
        }
    }
}
