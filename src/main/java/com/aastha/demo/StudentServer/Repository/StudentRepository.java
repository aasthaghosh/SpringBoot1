package com.aastha.demo.StudentServer.Repository;

import com.aastha.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}