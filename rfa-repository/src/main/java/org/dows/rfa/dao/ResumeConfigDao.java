package org.dows.rfa.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.rfa.entity.ResumeConfigEntity;
import org.dows.rfa.mapper.ResumeConfigMapper;

@Component
public class ResumeConfigDao extends CrudDaoImpl<ResumeConfigMapper,ResumeConfigEntity>{

}