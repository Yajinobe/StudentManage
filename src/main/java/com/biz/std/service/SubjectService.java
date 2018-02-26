package com.biz.std.service;

import com.biz.std.model.Pagination;
import com.biz.std.model.Subject;
import com.biz.std.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public Pagination findAllSubjects(int page, int rows) {
		Sort.Order order = new Sort.Order(Sort.Direction.ASC,"id");
		Sort sort = new Sort(order);
		
		Pageable pageable = new PageRequest(page-1,rows,sort);
		Page<Subject> list = subjectRepository.findAll(pageable);
		Pagination pagination = new Pagination(list.getTotalElements(),list.getNumber()+1,list.getContent());
		return pagination;
	}

	@Transactional
	public void saveSubject(Subject subject) {
		subjectRepository.save(subject);
	}


}
