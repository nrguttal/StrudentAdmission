package StudentAdmission.repository;

import StudentAdmission.model.Student;

import java.util.List;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentRepository  {

	public Student findById(Long id) { return null; }
    // Additional custom queries can be defined here if needed

	public Student save(Student student) { return null; }

	public void deleteById(Long id) {
	}

	public List<Student> findAll() { return null; };
	
	public List<String> findCoursesByStudentId(Long id) { return null; }	
}