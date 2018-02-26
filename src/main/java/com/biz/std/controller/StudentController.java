package com.biz.std.controller;

import com.biz.std.model.Student;
import com.biz.std.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/welcome")
    public ModelAndView apple(){
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tables");
        modelAndView.addObject("studentList",list);
        return modelAndView;
    }
   
}
