package com.zmsj.gondar.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangk
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

  public static void main(String[] args) {

    SpringApplication.run(RegistryApplication.class, args);
  }
}
