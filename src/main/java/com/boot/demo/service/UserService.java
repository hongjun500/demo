package com.boot.demo.service;

import com.boot.demo.pojo.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    //根据id查询；
    public User findUser(Integer id);

    //添加用户;
    public int addUser(User user);
}
