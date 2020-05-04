package com.example.demo.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {
	
	@ApiModelProperty(value = "�ƾƵ�",   required = true)
	private String id;

	@ApiModelProperty(value = "��й�ȣ", required = true)
	private String pw;
	
	@ApiModelProperty(value = "����", 	required = true)
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
