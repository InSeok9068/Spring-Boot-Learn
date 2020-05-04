package com.example.demo.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.domain.Message;

@RestController
public class TestController {
    
    @GetMapping("/")
    public String root_test() throws Exception{
        return "Hello Root(/)";
    }
 
    @GetMapping("/demo")
    public String demo_test() throws Exception{
        return "Hello demo(/demo)";
    }
    
    @PostMapping("/message")
    @ResponseBody
    public String pushMessage(@RequestBody Message msg) throws Exception{

	    if(msg.getMemo() != null || msg.getMemo().equals("")) {
	    	throw new Exception("메모를 입력해주세요.");
	    }
	    
	    return "성공";
	}
 
}