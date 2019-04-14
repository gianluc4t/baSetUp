package com.gt.zambalaie.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gt.zambalaie.endpoint.dto.GenericObjDto;
import com.gt.zambalaie.repository.entity.GenericObj;
import com.gt.zambalaie.service.GenericService;

@RestController()
@RequestMapping("controllerino")
public class GenericRestController {

  @Autowired
  private GenericService genericService;
  
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @GetMapping("/zanzara")
  public GenericObjDto zanzara() {
    logger.info("zanzara");
    GenericObj result = genericService.getObj("bubu");
    return result.toDto();
  }
  
}
