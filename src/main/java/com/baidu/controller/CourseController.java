package com.baidu.controller;

import com.baidu.entity.Result;
import com.baidu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class CourseController {
    @PostMapping("/course/add")
    @ResponseBody
    public Result add(@RequestBody User user, HttpSession session){
        return null;
    }
}
