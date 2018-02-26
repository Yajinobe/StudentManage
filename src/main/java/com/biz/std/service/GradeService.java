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

	@Transactional
	public void saveGrade(Grade grade) {
		gradeRepository.save(grade);
	}

}
