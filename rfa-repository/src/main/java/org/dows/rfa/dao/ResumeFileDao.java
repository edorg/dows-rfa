package org.dows.rfa.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.rfa.entity.ResumeFileEntity;
import org.dows.rfa.mapper.ResumeFileMapper;

@Component
public class ResumeFileDao extends CrudDaoImpl<ResumeFileMapper,ResumeFileEntity>{

}