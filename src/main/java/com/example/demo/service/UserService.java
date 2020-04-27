package com.example.demo.service;

import com.example.demo.dao.userDao;
import com.example.demo.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @author wangqiang
 * @date 2020/4/27
 */
@Service
public class UserService {
    @Autowired
    @Resource
    private userDao userDao;
    public String findById(Integer id){
        String[] num = new String[2];
        num[0] = "1";
        num[1] = "2";
        for (String s : num) {
            if (String.valueOf(id).equals(s)){
                return s;
            }
        }
      return "";
    }
}
