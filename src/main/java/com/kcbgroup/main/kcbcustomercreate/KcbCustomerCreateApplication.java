package com.kcbgroup.main.kcbcustomercreate;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KcbCustomerCreateApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	@Configuration
	@EnableWebMvc
	public class WebConfig extends WebMvcConfigurerAdapter {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(KcbCustomerCreateApplication.class, args);
	}

}
