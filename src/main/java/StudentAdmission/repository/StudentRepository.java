package StudentAdmission.repository;

import StudentAdmission.model.Student;

import java.util.List;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentRepository  {

	public Student findById(int id) { return null; }
    // Additional custom queries can be defined here if needed

	public Student save(Student student) { return null; }

	public void deleteById(int id) {
	}

	public List<Student> findAll() { return null; };
}