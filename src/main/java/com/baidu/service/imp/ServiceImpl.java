package com.baidu.service.imp;


import com.baidu.dao.UserDao;
import com.baidu.entity.Result;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public Result login(User user) {
        System.out.println("业务层");
        System.out.println(dao);
        User login = dao.login(user);

        Result result = new Result();
        if(login!=null){
            result.setMessage("登录成功");
            result.setFlag(true);
            return result;
        }else {
            result.setFlag(false);
            result.setMessage("登录失败");
            return result;
        }
    }
}
