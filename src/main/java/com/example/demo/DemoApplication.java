package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching				// Cache 기능 활성화
//@EnableBatchProcessing 	// Batch 기능 활성화
//@EnableScheduling 		// @Scheduled 어노테이션 기능 활성화
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
