package com.XenonStack.StudentManagementSyatem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.XenonStack.StudentManagementSyatem.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {	

}