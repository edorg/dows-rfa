package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeApplicationEntity;
import org.dows.rfa.dao.ResumeApplicationDao;

@Component
public class ResumeApplicationRepository  extends CrudRepository<ResumeApplicationDao,ResumeApplicationEntity> {

}