package myPack.RESTfull.RESTfull.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import myPack.RESTfull.RESTfull.Entity.Student;
import myPack.RESTfull.RESTfull.Srvice.StudentDAO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
	@Autowired
	StudentDAO service;
	
	@GetMapping("/student")
	public List<Map<String, Object>>getAllStudentInList(){
		return  service.getAllStudentInList();
	}
	@PostMapping("/student")
	public ResponseEntity<Object>insertStudent(@RequestBody Student stud){
		int cntRow = service.saveStudentInfo(stud);
		
		if(cntRow != 0)
			return ResponseEntity.ok("Student saved Successfully with details: "+stud);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student Not Seved...");
	}
	@GetMapping("/student/marks")
	public List<String>displayMarks(){
		return service.calculateTotalMarks();
	}
	@GetMapping("/student/{rNo}")
	public ResponseEntity<Object>getStudentById(@PathVariable int rNo){
		List<Map<String, Object>>studObj = service.StudentById(rNo);
		
		if(studObj.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student Not Found...."+studObj);
		else
			return ResponseEntity.ok(studObj);
	}
	@DeleteMapping("/student/{rollNo}")
	public ResponseEntity<Object>deleteStudent(@PathVariable int rollNo){
		int cntRow = service.deleteStudentById(rollNo);
		
		if(cntRow !=0)
			return ResponseEntity.ok("Student deleted Successfully");
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not Found...."+rollNo);
	}
	
}
