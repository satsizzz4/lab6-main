package com.glearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glearning.dto.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
