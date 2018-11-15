package com.boot.demo.mapper;

import com.boot.demo.pojo.Base;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BaseMapper {
    //根据ID查询某一个值
    @Select("select * from base where base_id=#{id}")
    public Base findBaseById(Integer id);

    //查询所有
    @Select("select * from base")
    public List<Base> findBaseAll();


}
