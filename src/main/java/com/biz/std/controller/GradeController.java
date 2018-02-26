package com.biz.std.controller;

import com.biz.std.model.Grade;
import com.biz.std.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class GradeController {

	@Autowired
	private GradeService gradeService;

	@RequestMapping("/gradesave.do")
	public void saveGrade(HttpServletResponse resp, Grade grade) throws IOException{
		gradeService.saveGrade(grade);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("1");
	}

}
