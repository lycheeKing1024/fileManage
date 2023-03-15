package com.zc.Service;

import com.zc.pojo.user;

import java.util.List;

public interface UserService {

   public   List<user> getUserList();

   public int insertUser(user user);

   public int upUser(user user);

   public int uppaw(user user);

   public user getUserById(int id);
}
