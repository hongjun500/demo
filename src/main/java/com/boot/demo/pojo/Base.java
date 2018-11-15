package com.boot.demo.pojo;

import java.io.Serializable;

public class Base implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer base_id;         //数据表id
    private String base_type_code;   //数据类别代码
    private String base_type_name;   //数据类别名称
    private Integer base_item_code;  //数据项目代码
    private String base_item_name;   //数据项目名称

    public Integer getBase_id() {
        return base_id;
    }

    public void setBase_id(Integer base_id) {
        this.base_id = base_id;
    }

    public String getBase_type_code() {
        return base_type_code;
    }

    public void setBase_type_code(String base_type_code) {
        this.base_type_code = base_type_code;
    }

    public String getBase_type_name() {
        return base_type_name;
    }

    public void setBase_type_name(String base_type_name) {
        this.base_type_name = base_type_name;
    }

    public Integer getBase_item_code() {
        return base_item_code;
    }

    public void setBase_item_code(Integer base_item_code) {
        this.base_item_code = base_item_code;
    }

    public String getBase_item_name() {
        return base_item_name;
    }

    public void setBase_item_name(String base_item_name) {
        this.base_item_name = base_item_name;
    }
}
