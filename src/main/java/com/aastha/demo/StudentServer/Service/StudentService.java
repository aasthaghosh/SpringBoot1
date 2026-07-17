package com.aastha.demo.StudentServer.Service;

import com.aastha.demo.StudentServer.Entity.Student;
import com.aastha.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student){
        int id = student.getId();
        String name = student.getName();
        String Department = student.getDepartment();
        int age = student.getAge();


        if(id < 0 || name == null || Department == null || age < 0){
            return null;
        }

        studentRepository.save(student);
        return student;

    }

}
