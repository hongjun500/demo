package com.boot.demo.pojo;
import java.util.Date;

public class User{
	private Integer id;
	private String name;
	private Date birthday;
	private String address;

	// 构造方法

	public User() {
		super();
	}

	public User(Integer id, String name, Date birthday, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	// getter & setter

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String username) {
		this.name = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



}
