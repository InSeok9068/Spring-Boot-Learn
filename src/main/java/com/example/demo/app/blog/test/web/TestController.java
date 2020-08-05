package com.example.demo.app.blog.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.blog.test.domain.Message;
import com.example.demo.app.blog.test.mapper.MessageMapper;
import com.example.demo.app.blog.test.service.EmpService;
import com.example.demo.config.properties.Config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TestController {
	
	private final EmpService empService;
	
	private final MessageMapper messageMapper;
	
	private final Config config;
 
    @GetMapping("/config")
    public String demo_test() throws Exception{
    	System.out.println(config);
        return "Hello demo(/demo)";
    }
    
    @GetMapping("/message")
    public String getMessage() throws Exception {
    	return String.valueOf(messageMapper.selectMessage().get("MSG"));
    }
    
    @PostMapping("/message")
    @ResponseBody
    public String pushMessage(@RequestBody Message msg) throws Exception{

	    if(msg.getMemo() != null || msg.getMemo().equals("")) {
	    	throw new Exception("메모를 입력해주세요.");
	    }
	    
	    return "성공";
	    
	}
    
    @GetMapping("/emp")
    public Object getEmp() throws Exception {
    	return empService.getEmp();
    }
    
    @GetMapping("/emp/cache")
    public Object getEmpForCache() throws Exception {
    	
        long start = System.currentTimeMillis(); // 수행시간 측정
        Object result = empService.getEmpForCache(); // db 조회
        long end = System.currentTimeMillis();

        log.info("Cache 수행시간 : "+ Long.toString(end-start));
        
    	return result;
    }
    
    @GetMapping("/emp/nocache")
    public Object getEmpForNoCache() throws Exception {
    	
        long start = System.currentTimeMillis(); // 수행시간 측정
        Object result = empService.getEmpForNoCache(); // db 조회
        long end = System.currentTimeMillis();

        log.info("NoCache 수행시간 : "+ Long.toString(end-start));
        
    	return result;
    }
    
    @GetMapping("/emp/cacheClear")
    @ResponseBody
    public String clearEmpCache(){
    	empService.clearEmpCache(); // 캐시제거
        return "cache clear!";
    }
 
}