package com.baidu.service.imp;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return true;
    }
}
