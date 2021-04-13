package com.example.demo.app.blog.jsonproperty.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JsonData1 {
    @JsonProperty("json_data1")
    private String jsonData1;
    @JsonProperty("json_data2")
    private String jsonData2;
}