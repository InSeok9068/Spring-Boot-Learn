package com.example.demo.common.domain;

public class BaseGenericRes<T> {
	private int resCode;
	
	private String resMsg;
	
	private T resObj;
	
	public BaseGenericRes() {
		this.resCode = 0;
		this.resMsg  = "";
	}

	public int getResCode() {
		return resCode;
	}

	public void setResCode(int resCode) {
		this.resCode = resCode;
	}

	public String getResMsg() {
		return resMsg;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}

	public T getResObj() {
		return resObj;
	}

	public void setResObj(T resObj) {
		this.resObj = resObj;
	}

}
