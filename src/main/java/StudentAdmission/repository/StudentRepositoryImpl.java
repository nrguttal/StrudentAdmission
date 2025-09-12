package StudentAdmission.repository;

import StudentAdmission.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class StudentRepositoryImpl implements StudentRepository//Custom 
{

    //@Autowired
    private MongoTemplate mongoTemplate;
    
    @Autowired
    public StudentRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

   // @Override
    public List<String> findCoursesByStudentId(Long id) {
       Query query = new Query(Criteria.where("id").is(id));
    //Query query = new Query(Criteria.where("name").is("Alice Johnson"));
        Student student = mongoTemplate.findOne(query, Student.class);
        
       // boolean  studentExists =	 mongoTemplate.exists(query,  Student.class);
        
       // Student student2 = new Student(); 
        
      /*  student2.setId(123456L);
        
        	student2.setName("Kusu In Wonderland");
        	student2.setAge(22);
        		student2.setCourses(List.of("Math", "Science"));
        
        		mongoTemplate.save(student2);
        		;
        		
        */
        if (student != null) {
            return student.getCourses();
        }
        return Collections.emptyList();
    }
    
    public List<Student> findByName(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		return mongoTemplate.find(query, Student.class);
	}
    
    public String findNameById(Long id) { 
    	Query query = new Query(Criteria.where("id").is(id));
		Student student = mongoTemplate.findOne(query, Student.class);
    	Object obj = mongoTemplate.findOne(query, Student.class);
		if(student != null) {
			return student.getName();
		}
		return null;
    }

	@Override
	public <S extends Student> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		 
		Query query = new Query(Criteria.where("id").is(id));
		    		      
		Student student = mongoTemplate.findOne(query, Student.class);
		        
		if (student != null) 
		{
     
			return Optional.of(student);
		       
		}
		
		        return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Student> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Student> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Student, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}