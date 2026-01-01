package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeFileEntity;
import org.dows.rfa.dao.ResumeFileDao;

@Component
public class ResumeFileRepository  extends CrudRepository<ResumeFileDao,ResumeFileEntity> {

}