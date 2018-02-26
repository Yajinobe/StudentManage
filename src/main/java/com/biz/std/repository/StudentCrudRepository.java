package com.biz.std.repository;

import com.biz.std.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCrudRepository extends CrudRepository<Student,Integer>{
}
