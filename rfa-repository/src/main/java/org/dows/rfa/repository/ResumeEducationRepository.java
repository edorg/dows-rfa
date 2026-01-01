package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeEducationEntity;
import org.dows.rfa.dao.ResumeEducationDao;

@Component
public class ResumeEducationRepository  extends CrudRepository<ResumeEducationDao,ResumeEducationEntity> {

}