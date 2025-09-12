package StudentAdmission.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import StudentAdmission.model.Student;

//@Repository
public interface StudentRepositoryCustom {
    List<String> findCoursesByStudentId(Long id);
    
    List<Student> findByName(String name);

	<S extends Student> S insert(S entity);

	<S extends Student> List<S> insert(Iterable<S> entities);

	<S extends Student> List<S> findAll(Example<S> example);

	<S extends Student> List<S> findAll(Example<S> example, Sort sort);

	<S extends Student> List<S> saveAll(Iterable<S> entities);

	List<Student> findAll();

	List<Student> findAllById(Iterable<Long> ids);

	<S extends Student> S save(S entity);

	Optional<Student> findById(Long id);

	boolean existsById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Student entity);

	void deleteAllById(Iterable<? extends Long> ids);

	void deleteAll(Iterable<? extends Student> entities);

	void deleteAll();

	List<Student> findAll(Sort sort);

	Page<Student> findAll(Pageable pageable);

	<S extends Student> Optional<S> findOne(Example<S> example);

	<S extends Student> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Student> long count(Example<S> example);

	<S extends Student> boolean exists(Example<S> example);

	<S extends Student, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);
}
