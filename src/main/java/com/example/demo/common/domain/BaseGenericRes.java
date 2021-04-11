package com.example.demo.common.domain;

import lombok.Data;

@Data
public class BaseGenericRes<T> {
	private int resCode;
	
	private String resMsg;
	
	private T resObj;
}
