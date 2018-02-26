package com.biz.std.service;

import com.biz.std.model.Grade;
import com.biz.std.model.Pagination;
import com.biz.std.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GradeService {

	@Autowired
	private GradeRepository gradeRepository;

	public Pagination findAllGrades(int page, int rows) {
		Sort.Order order = new Sort.Order(Sort.Direction.ASC,"id");
		Sort sort = new Sort(order);
		
		Pageable pageable = new PageRequest(page-1,rows,sort);
		Page<Grade> list = gradeRepository.findAll(pageable);
		Pagination pagination = new Pagination(list.getTotalElements(),list.getNumber()+1,list.getContent());
		return pagination;
	}

	@Transactional
	public void saveGrade(Grade grade) {
		gradeRepository.save(grade);
	}

}
