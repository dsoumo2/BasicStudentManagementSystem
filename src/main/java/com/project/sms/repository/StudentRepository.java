package com.project.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sms.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
