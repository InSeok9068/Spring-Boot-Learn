package com.example.demo.app.blog.jsonproperty.web;

import com.example.demo.app.blog.jsonproperty.domain.JsonData1;
import com.example.demo.app.blog.jsonproperty.domain.JsonData2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonPropertyController {

    @GetMapping(value = "/jsonproperty")
    public JsonData1 jsonproperty() {
        JsonData1 jsonData1 = new JsonData1();
        jsonData1.setJsonData1("123");
        jsonData1.setJsonData2("456");
        return jsonData1;
    }

    @GetMapping(value = "/jsonnaming")
    public JsonData2 jsonnaming() {
        JsonData2 jsonData2 = new JsonData2();
        jsonData2.setJsonData1("가나다");
        jsonData2.setJsonData2("마바사");
        return jsonData2;
    }
}
