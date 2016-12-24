package com.xframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();

		messageBundle.setBasename("classpath:messages");
		messageBundle.setDefaultEncoding("UTF-8");

		messageBundle.setUseCodeAsDefaultMessage(true);
		messageBundle.setCacheSeconds(0);
		return messageBundle;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
