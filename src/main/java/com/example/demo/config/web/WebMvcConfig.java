package com.example.demo.config.web;

import com.example.demo.config.filter.CustomFilter;
import com.example.demo.config.interceptor.Interceptor;
import com.example.demo.config.xss.HTMLCharacterEscapes;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RequiredArgsConstructor
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	private final Interceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
		        .addPathPatterns("/*");
//		        .excludePathPatterns("/login") 제외할 URL
		WebMvcConfigurer.super.addInterceptors(registry);
	}

    @Bean
    public FilterRegistrationBean<CustomFilter> getBeanCustamFilter(){
        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean(new CustomFilter());
         registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

	@Bean
	public MappingJackson2HttpMessageConverter jsonEscapeConverter() {
		// MappingJackson2HttpMessageConverter Default ObjectMapper 설정 및 ObjectMapper Config 설정
		ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json().build();
		objectMapper.getFactory().setCharacterEscapes(new HTMLCharacterEscapes());
		return new MappingJackson2HttpMessageConverter(objectMapper);
	}
    
}
