package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

/**
 * Created by 18149 on 2022/2/12.
 */

public interface UserService {

    User selectUser(String name);

    List<User> selectAll();

    User selectUserById(int id);
}
