package com.zipkin.sample.one.controller;

import com.zipkin.sample.one.service.OneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
@RequiredArgsConstructor
@Slf4j
public class OneController {
  private final OneService oneService;

  @GetMapping("/send")
  public String start() {
    log.info(">>> start .. one controller ... ");
    String result = oneService.send();
    log.info(">>> one controller ... {}",result);
    return result;
  }
}
