package com.example.demo.app.blog.biginteger.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.blog.biginteger.domain.BigIntegerVO;
import com.example.demo.app.blog.biginteger.domain.IntegerVO;
import com.example.demo.app.blog.biginteger.mapper.BigInterMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BigIntegerController {
	
	private final BigInterMapper bigInterMapper;

	@GetMapping("/integer")
	public IntegerVO getInteger() throws Exception {
		return bigInterMapper.selectInteger();
	}
	
	@GetMapping("/bigInteger")
	public BigIntegerVO getbigInteger() throws Exception {
		return bigInterMapper.selectBigInteger();
	}
	
}
