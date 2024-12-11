package myPack.famt.StudentApplication;

import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    private final JdbcTemplate jdbcTemplate;

    public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Method to fetch all students with courses
    public Map<Integer, Student> getAllStudentsWithCourses() {
        String sql = "SELECT s.studId, s.name, s.courseId, c.courseName, c.credits, c.startDate "
                   + "FROM student s "
                   + "JOIN cou c ON s.courseId = c.courseId";

        return jdbcTemplate.query(sql, new StudentWithCourseResultSetExtractor());
    }

    // Method to fetch a single student by name
    public Student getStudentByName(String name) {
        String sql = "SELECT s.studId, s.name, s.courseId, c.courseName, c.credits, c.startDate "
                   + "FROM student s "
                   + "JOIN cou c ON s.courseId = c.courseId "
                   + "WHERE s.name = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{name}, new StudentRowMapper());
        } catch (EmptyResultDataAccessException e) {
            // Log and return null if no student is found
            System.err.println("No student found with the name: " + name);
            return null;
        }
    }
    
}
