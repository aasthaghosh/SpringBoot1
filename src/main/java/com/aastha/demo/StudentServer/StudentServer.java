package com.aastha.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {

//    1. Store
    @PostMapping("/create")

    public String storeStudent(){
        return """
                id: 1
                name: Soham
                Department: CSE
                age 22
                """;
    }


//    2. Read


//    3. Update


//    4. Delete


}
