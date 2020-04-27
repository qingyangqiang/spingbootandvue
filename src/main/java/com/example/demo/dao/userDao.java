package com.example.demo.dao;

import com.example.demo.domain.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    user findById(Integer id);
}
