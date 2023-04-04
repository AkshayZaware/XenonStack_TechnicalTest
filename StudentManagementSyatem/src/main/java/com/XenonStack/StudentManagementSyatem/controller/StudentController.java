package com.XenonStack.StudentManagementSyatem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XenonStack.StudentManagementSyatem.model.Student;
import com.XenonStack.StudentManagementSyatem.services.StudentService;




@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getstudents() {
		return this.studentService.getStudents();
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable String studentId) {
		return this.studentService.getStudent(Long.parseLong(studentId));
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/student/{studentId}")
	public Student deleteStudent(@PathVariable String studentId){
		return this.studentService.deleteStudent(Long.parseLong(studentId));
	}
	
}