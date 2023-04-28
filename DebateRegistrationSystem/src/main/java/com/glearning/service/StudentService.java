package com.glearning.service;

import java.util.List;

import com.glearning.dto.Student;

public interface StudentService {
	List<Student> findAll();

	Student findById(int theId);

	void save(Student theStudent);

	void deleteById(int theId);
}
