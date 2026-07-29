package com.aastha.demo.StudentServer.Controller;

import com.aastha.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.aastha.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.aastha.demo.StudentServer.DTO.UpdateStudentRequestDTO;
import com.aastha.demo.StudentServer.Entity.Student;
import com.aastha.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {

        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);

        if (result == null) {
            return ResponseEntity.status(400).body("This is a very bad request");
        }

        return ResponseEntity.status(201).body(result);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.status(200).body(student);
    }

    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,
                                           @RequestBody UpdateStudentRequestDTO updatedStudent) {

        Student saved = studentService.studentUpdate(id, updatedStudent);

        if (saved == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(saved);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int id) {

        Student student = studentService.deleteStudent(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.status(200).body("Entry deleted successfully");
    }

}