package roy.assist.service.app.service.impls;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import roy.assist.service.app.pojo.SampleStudent;
import roy.assist.service.app.repository.SampleStudentRepository;
import roy.assist.service.app.service.SampleStudentService;

@Service
@AllArgsConstructor
public class SampleStudentServiceImpl implements SampleStudentService{
	
	private SampleStudentRepository studentRepository;

	@Override
	public SampleStudent createStudent(SampleStudent student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
