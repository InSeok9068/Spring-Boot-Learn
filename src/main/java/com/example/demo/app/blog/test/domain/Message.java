package com.example.demo.app.blog.test.domain;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Message {
	
	@NotNull(message = "Name cannot be null")
	private String memo;

}
