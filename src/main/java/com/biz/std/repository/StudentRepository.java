package com.biz.std.repository;

import com.biz.std.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
	
}
