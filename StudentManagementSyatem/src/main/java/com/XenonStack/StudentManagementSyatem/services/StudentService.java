package com.XenonStack.StudentManagementSyatem.services;




import java.util.List;

import com.XenonStack.StudentManagementSyatem.model.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(long studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student deleteStudent(long studentId);
}