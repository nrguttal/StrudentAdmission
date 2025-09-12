package StudentAdmission.controller;

import StudentAdmission.model.School;
import StudentAdmission.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schools")
public class SchoolController {
    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/message")
    public String hello() {
        return "Hello";
    }

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<School>> getSchoolById(@PathVariable Long id) {
        Optional<School> school = schoolService.getSchoolById(id);
        return ResponseEntity.ok(school);
    }

    @PostMapping("/school")
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        School created = schoolService.createSchool(school);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<School>> updateSchool(@PathVariable Long id, @RequestBody School school) {
        Optional<School> updated = schoolService.updateSchool(id, school);
        if (updated.isPresent()) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchool(@PathVariable Long id) {
        schoolService.deleteSchool(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/address")
    public ResponseEntity<String> getAddressBySchoolId(@PathVariable Long id) {
        String address = schoolService.getAddressBySchoolId(id);
        if (address != null) {
            return ResponseEntity.ok(address);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/name/{name}")
    public List<School> getSchoolsByName(@PathVariable String name) {
        return schoolService.getSchoolsByName(name);
    }
}
