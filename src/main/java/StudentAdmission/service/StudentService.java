package StudentAdmission.service;

import StudentAdmission.model.Student;
import StudentAdmission.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Component
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
    public Optional getStudentById(Long id) {
        return ( studentRepository.findById(id));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional updateStudent(Long id, Student studentDetails) {
        return studentRepository.findById(id);
                
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    */

    public List<String> getCoursesByStudentId(Long id) {
        return studentRepository.findCoursesByStudentId(id);
              
    }
}