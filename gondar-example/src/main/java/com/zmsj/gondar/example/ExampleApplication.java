package com.zmsj.gondar.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wang.kun
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ExampleApplication {

  public static void main(String[] args) {

    SpringApplication.run(ExampleApplication.class, args);
  }
}
