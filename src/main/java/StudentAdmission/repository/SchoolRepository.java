package StudentAdmission.repository;

import StudentAdmission.model.School;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SchoolRepository extends MongoRepository<School, Long>, SchoolRepositoryCustom {
    List<School> findByName(String name);
    String findAddressById(Long id);
}
