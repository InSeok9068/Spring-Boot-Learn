package com.example.demo.app.blog.test.domain;


import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Builder
@Getter
public class Message {
	
	@NotNull(message = "Name cannot be null")
	private String memo;

}
