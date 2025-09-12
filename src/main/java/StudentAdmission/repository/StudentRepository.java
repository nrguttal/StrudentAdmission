package StudentAdmission.repository;

import StudentAdmission.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
    List<Student> findByName(String name);
    List<String> findCoursesByStudentId(Long id);
    
    String  findNameById(Long id);
}