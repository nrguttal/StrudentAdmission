package StudentAdmission.service;

import StudentAdmission.model.School;
import StudentAdmission.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public Optional<School> getSchoolById(Long id) {
        return schoolRepository.findById(id);
    }

    public School createSchool(School school) {
    	
    	for(int i = 0; i< 5; i++) {
    		
    		School s = new School();
    		s.setId(i+1L);
    		s.setName("New School" + " " + i);
    		s.setAddress("New Address" + " " + i);
    		schoolRepository.save(s);
    	}
    	
        return null; //schoolRepository.save(school);
    }

    public Optional<School> updateSchool(Long id, School schoolDetails) {
        Optional<School> schoolOpt = schoolRepository.findById(id);
        if (schoolOpt.isPresent()) {
            School school = schoolOpt.get();
            school.setName(schoolDetails.getName());
            school.setAddress(schoolDetails.getAddress());
            return Optional.of(schoolRepository.save(school));
        }
        return Optional.empty();
    }

    public void deleteSchool(Long id) {
        schoolRepository.deleteById(id);
    }

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public String getAddressBySchoolId(Long id) {
        return schoolRepository.findAddressById(id);
    }

    public List<School> getSchoolsByName(String name) {
        return schoolRepository.findByName(name);
    }
}
