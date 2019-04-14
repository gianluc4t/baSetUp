package com.gt.zambalaie.repository.entity;

import com.gt.zambalaie.endpoint.dto.GenericObjDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class GenericObj {

  @Getter @Setter
  private String value;

  public GenericObj(String value) {
    this.value = value;
  }  
  
  public GenericObjDto toDto(){
    GenericObjDto result = new GenericObjDto(value);
    
    return result;
  }
}
