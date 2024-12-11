package myPack.famt.StudentApplication;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        // Create the Student object
        int studId = rs.getInt("studId");
        String name = rs.getString("name");
        int courseId = rs.getInt("courseId"); // Assuming you have courseId in your result set

        // Create a Course object using the extracted data
        int credits = rs.getInt("credits");
        String courseName = rs.getString("courseName");
        String startDate = rs.getString("startDate");

        Coures course = new Coures(courseId, courseName, credits, startDate); // Assuming you have Course class

        // Create the Student object and set the course
        Student student = new Student(name, studId, courseId, course);
        
        // Return the fully populated Student object
        return student;
    }
}
