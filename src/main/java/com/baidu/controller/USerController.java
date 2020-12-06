package com.baidu.controller;

import com.baidu.entity.Result;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/user/login")
    @ResponseBody
    public  Result login(@RequestBody User user,HttpSession session){

        Result result = service.login(user);

        return result;
    }
    /**
     * 退出
     */

    @GetMapping("/user/logout")
    @ResponseBody
    public Result logout(HttpSession session){
        session.invalidate();
        Result result = new Result();
        result.setFlag(true);
        result.setMessage("logout OK");
        return result;
    }
}
