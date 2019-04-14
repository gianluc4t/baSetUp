package com.gt.zambalaie.repository;

import org.springframework.stereotype.Component;
import com.gt.zambalaie.repository.entity.GenericObj;

@Component
public class GenericRepository {

  public GenericObj getObj(String value){
    return new GenericObj(value);
  }
  
}
