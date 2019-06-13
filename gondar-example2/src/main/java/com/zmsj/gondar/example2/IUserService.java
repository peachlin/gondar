package com.zmsj.gondar.example2;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wang.kun
 */
@FeignClient("user-service")
public interface IUserService {

  @GetMapping("/v1/test")
  List<User> listUser();
}
