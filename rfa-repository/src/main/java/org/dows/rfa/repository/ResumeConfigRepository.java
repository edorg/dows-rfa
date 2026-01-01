package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeConfigEntity;
import org.dows.rfa.dao.ResumeConfigDao;

@Component
public class ResumeConfigRepository  extends CrudRepository<ResumeConfigDao,ResumeConfigEntity> {

}