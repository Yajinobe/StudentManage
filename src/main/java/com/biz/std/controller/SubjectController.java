package com.biz.std.controller;

import com.biz.std.model.Subject;
import com.biz.std.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/subjectsave.do")
	public void saveSubject(HttpServletResponse resp, Subject subject) throws IOException{
		subjectService.saveSubject(subject);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("1");
	}
	

	@RequestMapping("/subjectupdate.do")
	public void updateGrade(HttpServletResponse resp, Subject subject) throws IOException{
		subjectService.updateSubject(subject);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("1");
	}

}
