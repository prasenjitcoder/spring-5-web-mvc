package com.mahato.spring.service;

import java.util.List;

import com.mahato.spring.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
