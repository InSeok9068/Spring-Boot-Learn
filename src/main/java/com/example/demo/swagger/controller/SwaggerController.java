
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
@Api(tags = {"1. Swagger Test"})	// Swagger 최상단 Controller 명칭
//@ApiIgnore // 제외처리
public class SwaggerController {

	@ApiOperation(value = "Get 통신", notes = "Get 통신 Note", response = BaseGenericRes.class )	// value: 해당 파라미터 명칭, notes : 메소드에 대한 설명란
//	@ApiImplicitParams({
//		@ApiImplicitParam(name="param1", value="파라미터 1", required=true, dataType="string"),
//		@ApiImplicitParam(name="param2", value="파라미터 2", required=true, dataType="string")
//	})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "페이지 없음"),
			@ApiResponse(code = 500, message = "서버 에러")
	})
	@GetMapping(value = "/swagger", produces = "application/json")
	public BaseGenericRes<String> GetRestApi(
			@ApiParam(value = "파라미터 1", required = true) @RequestParam(required = true, defaultValue = " ")  String param1,
			@ApiParam(value = "파라미터 2", required = true) @RequestParam(required = true, defaultValue = "0")  int    param2
			) {
		
		BaseGenericRes<String> result = new BaseGenericRes<String>();
		
		return result;
	}
	
	@ApiOperation(value = "Post 통신", notes = "Post 통신 Note", response = BaseGenericRes.class )	// value: 해당 파라미터 명칭, notes : 메소드에 대한 설명란
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "페이지 없음"),
			@ApiResponse(code = 500, message = "서버 에러")
	})
	@PostMapping(value = "/swagger", produces = "application/json")
	public BaseGenericRes<String> PostRestApi(@RequestBody User user 
			) {
		
		BaseGenericRes<String> result = new BaseGenericRes<String>();
		
		return result;
	}

}