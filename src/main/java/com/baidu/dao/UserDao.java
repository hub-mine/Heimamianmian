package com.baidu.dao;

import com.baidu.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {


    User login(User user);
}
