package org.dows.rfa.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.rfa.entity.ResumeCertificateEntity;
import org.dows.rfa.dao.ResumeCertificateDao;

@Component
public class ResumeCertificateRepository  extends CrudRepository<ResumeCertificateDao,ResumeCertificateEntity> {

}