package com.zmsj.gondar.example;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wang.kun
 */
@Mapper
public interface UserMapper {

  List<User> listUser();
}
