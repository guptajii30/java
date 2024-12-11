package myPack.famt.StudentApplication;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentSelect {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student g1) {
        String sqlStr = "INSERT INTO student VALUES(?, ?, ?)";
        return jdbcTemplate.update(sqlStr, g1.getCourseId(), g1.getName(), g1.getStudId());
    }

    public void getAllStudentList() {
        String sqlStr = "SELECT * FROM student";
        System.out.println(jdbcTemplate.queryForList(sqlStr));
    }

    public int deleteStudent(int studentId) {
        String sqlStr = "DELETE FROM student WHERE studId = ?";
        return jdbcTemplate.update(sqlStr, studentId);
    }

    public int updateStudent(Student g1) {
        String sqlStr = "UPDATE student SET courseId = ?, StudCourseNm = ? WHERE studId = ?";
        return jdbcTemplate.update(sqlStr, g1.getCourseId(), g1.getName(), g1.getStudId());
    }
}
