package com.biz.std.service;

import com.biz.std.model.Student;
import com.biz.std.repository.StudentCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentCrudRepository studentCrudRepository;

    public List<Student> findAll(){
        return (List<Student>) studentCrudRepository.findAll();
    }

}
