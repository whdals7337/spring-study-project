package com.spring.study.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ServletComponentScan
@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringStudyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyProjectApplication.class, args);
	}

}
