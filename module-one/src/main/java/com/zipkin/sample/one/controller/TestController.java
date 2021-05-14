package com.zipkin.sample.one.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class TestController {

  @GetMapping("/api/user/{name}")
  public String callName(@PathVariable String name){
    log.info(" >>> GET ");
    return "call name "+ name;
  }

  @GetMapping("/")
  public String hello(){
    return "hello";
  }

}