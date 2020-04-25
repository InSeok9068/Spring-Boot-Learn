package com.example.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;

@RestController
public class TestController {
    
    @RequestMapping("/")
    public String root_test() throws Exception{
        return "Hello Root(/)";
    }
 
    @RequestMapping("/demo")
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