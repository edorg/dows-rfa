package org.dows.rfa.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.rfa.entity.ResumeUserEntity;
import org.dows.rfa.mapper.ResumeUserMapper;

@Component
public class ResumeUserDao extends CrudDaoImpl<ResumeUserMapper,ResumeUserEntity>{

}