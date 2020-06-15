package com.example.demo.config.properties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "config")
@Component
@Data
public class Config {
	private String test1;
	
	private int test2;
	
	private double test3;
	
	private Map<String, Object> testMap;
}
