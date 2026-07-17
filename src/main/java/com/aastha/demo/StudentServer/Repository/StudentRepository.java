package com.aastha.demo.StudentServer.Repository;



import com.aastha.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {


}
