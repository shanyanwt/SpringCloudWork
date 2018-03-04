package com.lovnx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanJiang 2018年3月2日
 *
 */

// @EnableEurekaClient
@SpringBootApplication
@RestController
public class ArticleServer {

	public static void main(String[] args) {
		SpringApplication.run(ArticleServer.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

	@Value("${foo}")
	String foo;

	@RequestMapping(value = "/hi2")
	public String hi2() {
		return foo;
	}

}