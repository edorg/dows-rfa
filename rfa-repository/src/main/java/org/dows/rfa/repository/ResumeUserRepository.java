package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeUserEntity;
import org.dows.rfa.dao.ResumeUserDao;

@Component
public class ResumeUserRepository  extends CrudRepository<ResumeUserDao,ResumeUserEntity> {

}