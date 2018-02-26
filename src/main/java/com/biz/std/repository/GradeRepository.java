package com.biz.std.repository;

import com.biz.std.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GradeRepository extends JpaRepository<Grade,Integer>,JpaSpecificationExecutor<Grade> {

}
