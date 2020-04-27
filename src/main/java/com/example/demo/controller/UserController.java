package com.example.demo.controller;

import com.example.demo.domain.user;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqiang
 * @date 2020/4/27
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findbyid/{id}")
    public String findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }
}
