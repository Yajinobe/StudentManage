package com.biz.std.repository;

import com.biz.std.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
	
	@Query("select s from Student s where s.number = ?1")
	public Student findByStudentNumber(String number);
}
