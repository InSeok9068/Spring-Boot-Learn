package com.example.demo.domain;

import javax.validation.constraints.NotNull;

public class Message {
	
	@NotNull(message = "Name cannot be null")
	private String Memo;

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}
}
