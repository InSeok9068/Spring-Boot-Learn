package com.example.demo.app.blog.xss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class XssController {

    @GetMapping(value = "/responseXss")
    Map<String, Object> responseXss(){
        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("htmlTdTag", "<td></td>");
        resultMap.put("htmlTableTag", "<table>");

        return resultMap;
    }
}
