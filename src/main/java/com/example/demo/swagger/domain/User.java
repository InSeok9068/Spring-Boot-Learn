package com.example.demo.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {
	
	@ApiModelProperty(value = "아이디",   required = true)
	private String id;

	@ApiModelProperty(value = "패스워드", required = true)
	private String pw;
	
	@ApiModelProperty(value = "나이", 	required = true)
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
