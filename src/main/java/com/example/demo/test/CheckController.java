package com.example.demo.test;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @RequestMapping(value = "/check")
    public String check(@ModelAttribute Check check){
        System.out.println(check);
        return "OK";
    }
}
