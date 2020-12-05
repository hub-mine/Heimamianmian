package com.baidu.controller;

import com.baidu.entity.Result;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller

public class USerController {
    /**
     *
     * 登录
     *
     */
    @Autowired
    private UserService service ;
    @RequestMapping("/user/login")
    public @ResponseBody Result login(@RequestBody User user){
        boolean login = service.login(user);
        System.out.println(user);
        if(login){

            Result result = new Result();
            result.setFlag(true);
            result.setMessage("loginOk");
            return result;
        }else {
            return new Result(false,"密码错误");
        }

    }
}
