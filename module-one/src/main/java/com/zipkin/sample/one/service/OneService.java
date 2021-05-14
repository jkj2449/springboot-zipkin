package com.zipkin.sample.one.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Slf4j
@Service
public class OneService {
  private static final String URL = "http://localhost:8082/two/ping";
  private final RestTemplate restTemplate;

  public String send() {
    log.info(">>> first service");

    String response = restTemplate.getForObject(URL, String.class);

    log.info(">>> from second-point .... response : {}", response);
    return "finish";
  }
}
