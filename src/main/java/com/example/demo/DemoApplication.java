package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {
// extends SpringBootServletInitializer implements WebMvcConfigurer
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    registry.addResourceHandler("/**")
//	            .addResourceLocations("classpath:/static/")
//	            .resourceChain(true);
//	  }

}



