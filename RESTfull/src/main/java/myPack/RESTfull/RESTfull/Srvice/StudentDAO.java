package myPack.RESTfull.RESTfull.Srvice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import myPack.RESTfull.RESTfull.Entity.Student;

@Repository
public class StudentDAO { 
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudentInfo(Student s) {
		String sqlStr = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sqlStr, s.getRollNo(), s.getStudNm(), s.getMrks1(), s.getMrks2(), s.getMrks3());
	}
	public List<Map<String, Object>>getAllStudentInList(){
		String sqlStr = "SELECT * FROM student";
		return jdbcTemplate.queryForList(sqlStr);
	}
	public List<String>calculateTotalMarks(){
		String sqlStr = "SELECT * FROM student";
		List<Map<String, Object>> studList = jdbcTemplate.queryForList(sqlStr);
		
		List<String> marklst = new ArrayList<String>();
		String str = "";
		for(int i = 0; i<studList.size(); i++) {
			Map<String, Object> studElt = studList.get(i);
			int sid = (int) studElt.get("rollNo");
			String snm = (String)studElt.get("studNm");
			int sm2 = (int)studElt.get("mrks1");
			int sm3 = (int)studElt.get("mrks2");
			int sm4 = (int)studElt.get("mrks3");
			
			str = "Student Details with Total Marks: "+sid+" "+" "+snm+" "+(sm2+sm3+sm4);
			marklst.add(str);
		}
		return marklst;
	}
	public List<Map<String, Object>> StudentById(int rNo) {
		// TODO Auto-generated method stub
		String sqlStr = "SELECT * FROM student WHERE rollNO = "+rNo;
		return jdbcTemplate.queryForList(sqlStr);
	}
	public int deleteStudentById(int rollNo) {
		// TODO Auto-generated method stub
		String sqlStr = "DELETE * FROM student WHERE rollNO = "+rollNo;
		return jdbcTemplate.update(sqlStr);
	}
}
