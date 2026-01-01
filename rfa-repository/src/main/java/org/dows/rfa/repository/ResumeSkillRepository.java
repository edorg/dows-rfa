package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeSkillEntity;
import org.dows.rfa.dao.ResumeSkillDao;

@Component
public class ResumeSkillRepository  extends CrudRepository<ResumeSkillDao,ResumeSkillEntity> {

}