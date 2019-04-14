package com.gt.zambalaie.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gt.zambalaie.repository.GenericRepository;
import com.gt.zambalaie.repository.entity.GenericObj;
import com.gt.zambalaie.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService {

  @Autowired
  private GenericRepository genericRepository;

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  public GenericObj getObj(String value){
    logger.info(String.format("getObj(%s)", value));
    return genericRepository.getObj(value);
  }

}
