package com.zmsj.gondar.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wang.kun
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ExampleApplication {

  public static void main(String[] args) {

    SpringApplication.run(ExampleApplication.class, args);
  }
}
