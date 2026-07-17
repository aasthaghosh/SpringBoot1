package com.aastha.demo.StudentServer.Controller;

import com.aastha.demo.StudentServer.Entity.Student;
import com.aastha.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }

    //update

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,@RequestBody Student updatedStudent){
        Student exstudent = studentService.getStudentById(id);

        if(exstudent == null){
            return ResponseEntity.status(404).body("Student not found");
        }

        exstudent.setName(updatedStudent.getName());
        exstudent.setAge(updatedStudent.getAge());
        exstudent.setDepartment(updatedStudent.getDepartment());

        Student saved = studentService.updateStudent(exstudent);
        return ResponseEntity.ok(saved);
    }



    //Delete
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        if(student==null){
            return ResponseEntity.status(404).body("Student not found");
        }
        studentService.deleteStudentById(id);
        return ResponseEntity.status(200).body("Entry deleted successfully");
    }


}
