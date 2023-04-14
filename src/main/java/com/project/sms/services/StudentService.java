package com.project.sms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.entity.Student;
import com.project.sms.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public void addStudent(Student st) {
		repository.save(st);
	}
	
	public List<Student> getAllStudent(){
		
		return repository.findAll();
	}
	
	public Student getStudentById(int Id) {
		
		Optional<Student> s= repository.findById(Id);
		if(s.isPresent()) {
			return s.get();
		}
		else return null;
	}

	public void deleteStudent(int Id) {
		repository.deleteById(Id);
		
	}

}
