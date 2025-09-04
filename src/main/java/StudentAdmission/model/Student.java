package StudentAdmission.model;

import jakarta.persistence.ElementCollection;/*
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Student {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    @ElementCollection
    private List<String> courses;

    public Student() {}

    public Student(Long id, String name, int age, List<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public List<String> getCourses() { return courses; }
    public void setCourses(List<String> courses) { this.courses = courses; }

	public Object map(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}