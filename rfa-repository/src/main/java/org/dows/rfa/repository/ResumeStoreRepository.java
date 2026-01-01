package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeStoreEntity;
import org.dows.rfa.dao.ResumeStoreDao;

@Component
public class ResumeStoreRepository  extends CrudRepository<ResumeStoreDao,ResumeStoreEntity> {

}