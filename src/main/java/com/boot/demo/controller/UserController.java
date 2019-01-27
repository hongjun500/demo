package com.boot.demo.controller;

import com.boot.demo.pojo.User;
import com.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@RequestMapping(value = "/user")
@RestController
public class UserController {
     @Autowired
     private UserService userService;

     @RequestMapping(value = "/search")
     public User searchId(Integer id){
         return userService.findUser(id);
     }

     @RequestMapping(value = "/add")
     public int add() throws Exception{

          SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yy/MM/dd");
          Date  time=simpleDateFormat.parse("2018/11/6");
          User user=new User();
          user.setName("新坦结衣");
          user.setBirthday(time);
          user.setAddress("日本");
          return userService.addUser(user);
     }
}

