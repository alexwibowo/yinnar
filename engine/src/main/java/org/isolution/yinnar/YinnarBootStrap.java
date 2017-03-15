package org.isolution.yinnar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class YinnarBootStrap {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(final String[] args){
		SpringApplication.run(YinnarBootStrap.class, args);
	}
}
