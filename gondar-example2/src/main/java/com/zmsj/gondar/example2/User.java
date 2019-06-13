package com.zmsj.gondar.example2;

import java.util.Date;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class User {

  private String id;

  private String userName;

  private String password;

  private String name;

  private String telphone;

  private Date modifyTime;
}
