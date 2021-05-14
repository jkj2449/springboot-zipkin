package com.zipkin.sample.two.controller;

import com.zipkin.sample.two.service.TwoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/two")
public class TwoController {
  private final TwoService twoService;

  @GetMapping("/ping")
  public String ping() {
    log.info(">>> second-point .... ");
    String result = twoService.ping();
    log.info(">>> second-point .... {} ", result);
    return result;
  }
}
