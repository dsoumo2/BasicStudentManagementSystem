package com.project.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.sms.entity.Student;
import com.project.sms.services.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SmsController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String home(Model m) {
		
		List<Student> stu = studentService.getAllStudent();
		m.addAttribute("stu",stu);
		return "index";
	}
	@GetMapping("/addStudent")
	public String addStudentForm() {
		return "addStudent";
	}

	@PostMapping("/register")
	public String studentRegister(@ModelAttribute Student st , HttpSession session) {
		
		System.out.println(st);
		studentService.addStudent(st);
		session.setAttribute("msg", "Data Added Successfully....");
		return "redirect:/students";
	}
	@GetMapping("/edit/{Id}")
	public String edit(@PathVariable int Id , Model m) {
		Student s =studentService.getStudentById(Id);
		m.addAttribute("stu",s);
	return "editStudent";
	}
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student s, HttpSession session) {
	    studentService.addStudent(s);
		session.setAttribute("msg", "Data Update Sucessfully..");
		return "redirect:/students";
	}
	@GetMapping("/delete/{Id}")
	public String deleteStudent(@PathVariable int Id, HttpSession session) {

		studentService.deleteStudent(Id);
		session.setAttribute("msg", "Data Delete Sucessfully..");
		return "redirect:/students";
	}
}
