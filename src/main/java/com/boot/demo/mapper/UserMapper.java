package com.boot.demo.mapper;

import com.boot.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;


public interface UserMapper {
     public User findUserById(Integer id);
     public int addUser(User user);
}
