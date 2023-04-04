package com.XenonStack.StudentManagementSyatem.model;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String course;
	private String email;
	private String phone;
	
	public Student() { }

	public Student(Long id, String name, String course, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.phone = phone;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
}