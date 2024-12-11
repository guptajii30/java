package myPack.famt.StudentApplication;

import org.springframework.jdbc.core.JdbcTemplate;

public class CouresSelect {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveCoures(Coures c1) {
        String sqlStr = "INSERT INTO cou VALUES(?, ?, ?, ?)";
        return jdbcTemplate.update(sqlStr, c1.getCourseId(), c1.getCourseName(), c1.getCredits(), c1.getStartDate());
    }

    public void getAllCouresList() {
        String sqlStr = "SELECT * FROM cou";
        System.out.println(jdbcTemplate.queryForList(sqlStr));
    }

    public int deleteCoures(int couresId) {
        String sqlStr = "DELETE FROM cou WHERE courseId = ?";
        return jdbcTemplate.update(sqlStr, couresId);
    }

    public int updateCoures(Coures c1) {
        String sqlStr = "UPDATE cou SET courseName = ?, credits = ?, startDate = ? WHERE courseId = ?";
        return jdbcTemplate.update(sqlStr, c1.getCourseName(), c1.getCredits(), c1.getStartDate(), c1.getCourseId());
    }
}
