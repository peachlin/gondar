package com.zmsj.gondar.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wangk
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class GateWayApplication {

  public static void main(String[] args) {

    SpringApplication.run(GateWayApplication.class, args);
  }
}
