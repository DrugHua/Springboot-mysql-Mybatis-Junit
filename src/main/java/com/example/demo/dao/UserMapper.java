package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 18149 on 2022/2/12.
 */
public interface UserMapper {

    User selectUser(@Param("name") String name);

    User selectUserbyId(@Param("id") int id);

    List<User> selectAll();
}
