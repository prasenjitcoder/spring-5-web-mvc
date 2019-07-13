package com.mahato.spring.dao;

import java.util.List;

import com.mahato.spring.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
