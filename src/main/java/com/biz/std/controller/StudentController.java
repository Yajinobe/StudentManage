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
    @RequestMapping("/studentsave.do")
	public void saveStudent(HttpServletResponse resp,String number,String name,String picture,String sex,String birthday) throws IOException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Student student = new Student(number, name, picture, sex, sdf.parse(birthday));
		String flag = studentService.saveStudent(student);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print(flag);
	}
	@RequestMapping("/studentupdate.do")
	public void updateStudent(HttpServletResponse resp,Integer id,String number,String name,String picture,String sex,String birthday) throws IOException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Student stu = new Student(id, number, name, picture, sex, sdf.parse(birthday));
		studentService.updateStudent(stu);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("1");
	}
	
	@RequestMapping("/studentdelete.do")
	public void deleteStudent(HttpServletResponse resp,String ids) throws IOException{
		String[] arrayId = ids.split(",");
		studentService.deleteStudent(arrayId);
		resp.getWriter().println(new Integer(arrayId.length).toString());
	}
}
