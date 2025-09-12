package StudentAdmission.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "students")
public class Student {
    @Id
    private Long id;
    private String name;
    private int age;
    private List<String> courses;

    public Student() {}

    public Student(Long id, String name, int age, List<String> courses) {
        this.id =  id;
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