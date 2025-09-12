package StudentAdmission.controller;

import StudentAdmission.model.Student;
import StudentAdmission.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/message")
    public String Hello()
    {
		return "Hello";
	}

    
    @GetMapping
    public List<Student> getAllStudents() {
       // return studentService.getAllStudents();
    	return null;
    }
/*
    @GetMapping("/{id}")
    public Optional getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
                
    }

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student created =  studentService.createStudent(student);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        try {
            Optional updated = studentService.updateStudent(id, student);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
    
    */
    @GetMapping("/{id}/courses")
    public ResponseEntity<List<String>> getCoursesByStudentId(@PathVariable Long id) {
        List<String> courses = studentService.getCoursesByStudentId(id);
        if (courses != null) {
            return ResponseEntity.ok(courses);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}