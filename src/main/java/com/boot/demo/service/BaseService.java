package com.boot.demo.service;

import com.boot.demo.mapper.BaseMapper;
import com.boot.demo.pojo.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "BaseService")
public class BaseService{
    @Autowired
    private BaseMapper baseMapper;

    //根据ID查询
    public Base searchBase(Integer id){
         return baseMapper.findBaseById(id);
    }

    public List<Base> searchBaseAll(){
        return baseMapper.findBaseAll();
    }

}
