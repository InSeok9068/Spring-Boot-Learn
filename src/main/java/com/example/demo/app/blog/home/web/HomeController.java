package com.example.demo.app.blog.home.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("home", "home");
        return "home";
    }
}
