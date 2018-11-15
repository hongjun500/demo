package com.boot.demo.service.impl;

import com.boot.demo.mapper.UserMapper;
import com.boot.demo.pojo.User;
import com.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
