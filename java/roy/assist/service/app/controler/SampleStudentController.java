package roy.assist.service.app.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import roy.assist.service.app.pojo.SampleStudent;
import roy.assist.service.app.service.SampleStudentService;

@RestController
@AllArgsConstructor

@RequestMapping("roy/api/students")
public class SampleStudentController {
	private SampleStudentService stdService;
	
	@PostMapping
	public ResponseEntity<SampleStudent> createStudents(@RequestBody SampleStudent std){
		SampleStudent savedStd = stdService.createStudent(std);
		return new ResponseEntity<>(savedStd, HttpStatus.CREATED);
	}
}
