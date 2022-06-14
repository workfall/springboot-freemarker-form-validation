package com.workfall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FreemarkerFormValidation {

  public static void main(String[] args) {
    SpringApplication.run(FreemarkerFormValidation.class, args);
    log.info("Application started successfully");
  }
}
