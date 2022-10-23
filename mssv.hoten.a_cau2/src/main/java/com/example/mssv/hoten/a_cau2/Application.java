package com.example.mssv.hoten.a_cau2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		DefaultUriBuilderFactory defaultUriBuilderFactory = new DefaultUriBuilderFactory(
				"http://localhost:8080/");
		restTemplate.setUriTemplateHandler(defaultUriBuilderFactory);
		return restTemplate;
	}
}
