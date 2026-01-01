package org.dows.rfa.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.rfa.entity.ResumeMailEntity;
import org.dows.rfa.mapper.ResumeMailMapper;

@Component
public class ResumeMailDao extends CrudDaoImpl<ResumeMailMapper,ResumeMailEntity>{

}