package com.aastha.demo.StudentServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    StudentService studentService;

    @Autowired
    public  StudentController(StudentService studentService){
        this.studentService =studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody Student student){
        Student result = studentService.studentValidate(student);
        if(result == null){
            return ResponseEntity.status(400).body("This is a very bad request");
        }
        return ResponseEntity.status(201).body(result);
    }

}
