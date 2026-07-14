package com.aastha.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {

//    1. Store
    @PostMapping("/create")

    public String storeStudent(@RequestBody Student student){
        int id = student.getId();
        String name = student.getName();
        String Department = student.getDepartment();
        int age = student.getAge();
        return "id: " +id+
                " name: "+ name+
                " Dep: "+Department+
                " age: "+age;
    }


//    2. Read


//    3. Update


//    4. Delete


}
