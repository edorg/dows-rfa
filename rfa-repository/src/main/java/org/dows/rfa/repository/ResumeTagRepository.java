package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeTagEntity;
import org.dows.rfa.dao.ResumeTagDao;

@Component
public class ResumeTagRepository  extends CrudRepository<ResumeTagDao,ResumeTagEntity> {

}