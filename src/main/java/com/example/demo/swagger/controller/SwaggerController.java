package com.example.demo.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.domain.BaseGenericRes;
import com.example.demo.swagger.domain.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

// https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Annotations#quick-annotation-overview

@RestController
@Api(tags = {"1. Swagger Test"})	// Swagger �ֻ�� Controller ��Ī
//@ApiIgnore // ����ó��
public class SwaggerController {

	@ApiOperation(value = "Get ���", notes = "Get ��� Note", response = BaseGenericRes.class )	// value: �ش� �Ķ���� ��Ī, notes : �޼ҵ忡 ���� �����
//	@ApiImplicitParams({
//		@ApiImplicitParam(name="param1", value="�Ķ���� 1", required=true, dataType="string"),
//		@ApiImplicitParam(name="param2", value="�Ķ���� 2", required=true, dataType="string")
//	})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "������ ����"),
			@ApiResponse(code = 500, message = "���� ����")
	})
	@GetMapping(value = "/swagger", produces = "application/json")
	public BaseGenericRes<String> GetRestApi(
			@ApiParam(value = "�Ķ���� 1", required = true) @RequestParam(required = true, defaultValue = " ")  String param1,
			@ApiParam(value = "�Ķ���� 2", required = true) @RequestParam(required = true, defaultValue = "0")  int    param2
			) {
		
		BaseGenericRes<String> result = new BaseGenericRes<String>();
		
		return result;
	}
	
	@ApiOperation(value = "Post ���", notes = "Post ��� Note", response = BaseGenericRes.class )	// value: �ش� �Ķ���� ��Ī, notes : �޼ҵ忡 ���� �����
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "������ ����"),
			@ApiResponse(code = 500, message = "���� ����")
	})
	@PostMapping(value = "/swagger", produces = "application/json")
	public BaseGenericRes<String> PostRestApi(@RequestBody User user 
			) {
		
		BaseGenericRes<String> result = new BaseGenericRes<String>();
		
		return result;
	}

}
