package com.biz.std.repository;

import com.biz.std.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SubjectRepository extends JpaRepository<Subject,Integer>,JpaSpecificationExecutor<Subject> {

}
