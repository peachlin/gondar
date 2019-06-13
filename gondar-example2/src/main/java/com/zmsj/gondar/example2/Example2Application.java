package com.zmsj.gondar.example2;

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
public class Example2Application {

  public static void main(String[] args) {

    SpringApplication.run(Example2Application.class, args);
  }
}
