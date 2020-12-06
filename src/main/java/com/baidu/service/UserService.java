package com.baidu.service;

import com.baidu.entity.Result;
import com.baidu.pojo.User;

public interface UserService {
    Result login(User user);
}
