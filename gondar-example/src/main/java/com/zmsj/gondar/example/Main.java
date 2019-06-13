package com.zmsj.gondar.example;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang.kun
 */
@RestController
@RequestMapping("/v1/test")
public class Main {

  @Resource
  private UserMapper userMapper;

  @GetMapping
  public List<User> getUsers() {
    return userMapper.listUser();
  }
}
