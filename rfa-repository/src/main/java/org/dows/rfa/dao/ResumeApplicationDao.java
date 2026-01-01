package org.dows.rfa.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.rfa.entity.ResumeApplicationEntity;
import org.dows.rfa.mapper.ResumeApplicationMapper;

@Component
public class ResumeApplicationDao extends CrudDaoImpl<ResumeApplicationMapper,ResumeApplicationEntity>{

}