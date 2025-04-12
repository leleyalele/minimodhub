package com.leleyalele.minimodhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MinimodhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimodhubApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "index"; // 返回模板名称
	}
}


