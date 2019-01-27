package com.boot.demo.controller;


import com.boot.demo.pojo.Base;
import com.boot.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/base")
@RestController
public class BaseController {
    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "/search")
    public Base search(Integer id){
        return baseService.searchBase(2);
    }

    @RequestMapping(value = "/searchAll")
    public List<Base> searchAll(){
        return baseService.searchBaseAll();
    }

}
