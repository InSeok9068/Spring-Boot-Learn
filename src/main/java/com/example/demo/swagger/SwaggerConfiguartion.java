package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguartion {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
//            .apis(RequestHandlerSelectors.any()) // ��� RequestMapping URI ����
            .apis(RequestHandlerSelectors.basePackage("com.example.demo")) // ��Ű�� ���� ����
            .paths(PathSelectors.any()) // ��� ���� URI�� ����
//            .paths(PathSelectors.ant("/v2/**")) // ��� ���� URI�� ����
            .build()
            .apiInfo(apiInfo())
            .useDefaultResponseMessages(false); // Response ���� �޽��� ����Ʈ�� ���� X
    }

    private ApiInfo apiInfo() {
    	return new ApiInfoBuilder()
    			.title("REST API")
    			.description("��������Ʈ ���� ������Ʈ")
    			.version("v1")
    			.termsOfServiceUrl("���� ��� URL")
    			.contact("dlstjr9068@gmail.com")
    			.license("License")
    			.licenseUrl("localhost:8080")
    			.build();
    	
//      return new ApiInfo(
//      "REST API", 					//title
//      "��������Ʈ ���� ������Ʈ", 			//description
//      "v1", 							//version
//      "���� ��� URL", 					//termsOfServiceUrl
//      "dlstjr9068@gmail.com", 		//contactName
//      "License", 						//license
//      "localhost:8080"); 				//licenseUrl    	
    }
}