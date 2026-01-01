package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeMailEntity;
import org.dows.rfa.dao.ResumeMailDao;

@Component
public class ResumeMailRepository  extends CrudRepository<ResumeMailDao,ResumeMailEntity> {

}