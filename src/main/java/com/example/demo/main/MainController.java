package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

//    @GetMapping("/index")
    @RequestMapping(value = "/index")
    public String index(Model model) throws Exception{
    	model.addAttribute("serverName", "Multipart Server!!!");
    	return "index";
    }
}
