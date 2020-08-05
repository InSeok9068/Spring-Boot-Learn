package com.example.demo.app.blog.biginteger.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.app.blog.biginteger.domain.BigIntegerVO;
import com.example.demo.app.blog.biginteger.domain.IntegerVO;

@Mapper
public interface BigInterMapper {
	
	IntegerVO selectInteger();
	
	BigIntegerVO selectBigInteger();

}
