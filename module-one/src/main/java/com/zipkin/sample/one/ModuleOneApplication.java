package com.zipkin.sample.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.zipkin.sample"})
@SpringBootApplication
public class ModuleOneApplication {
  public static void main(String[] args) {
    SpringApplication.run(ModuleOneApplication.class, args);
  }
}
