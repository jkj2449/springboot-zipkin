package com.zipkin.sample.two.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TwoService {
  public String ping(){
    log.info(">>> second service ... end");
    return "request ping success!!";
  }
}
