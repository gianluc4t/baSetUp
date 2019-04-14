package com.gt.zambalaie.endpoint.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class GenericObjDto {

  @Getter @Setter
  private String value;

  public GenericObjDto(String value) {
    this.value = value;
  }  
  
}
