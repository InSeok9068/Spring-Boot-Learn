package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) throws Exception{
    	model.addAttribute("serverName", "Multipart Server!!!");
    	return "index";
    }
}
