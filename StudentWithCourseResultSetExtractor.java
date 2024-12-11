package myPack.famt.StudentApplication;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class StudentWithCourseResultSetExtractor implements ResultSetExtractor<Map<Integer, Student>> {

    @Override
    public Map<Integer, Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
        Map<Integer, Student> students = new HashMap<>();

        while (rs.next()) {
            // Extract student data from the result set
            int studId = rs.getInt("studId");
            String name = rs.getString("name");  // Ensure column name is correct here
            int courseId = rs.getInt("courseId");  // Assuming you have courseId in your result set

            // Extract course data from the result set
            String courseName = rs.getString("courseName");
            int credits = rs.getInt("credits");
            String startDate = rs.getString("startDate");

            // Create Course object from the extracted data
            Coures course = new Coures(courseId, courseName, credits, startDate);

            // Create Student object with the extracted student data
            Student student = new Student(name, studId, courseId, course);

            // Put the student in the map, keyed by studId
            students.put(studId, student);
        }

        return students;
    }
}
