package com.example.demo.app.blog.xss;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XssController {

    @GetMapping(value = "/responseXss")
    JsonObject responseXss(){
        JsonObject resultJson = new JsonObject();

        resultJson.addProperty("htmlTdTag", "<td></td>");
        resultJson.addProperty("htmlTableTag", "<table>");

        return resultJson;
    }
}
