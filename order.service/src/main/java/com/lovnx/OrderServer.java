package com.lovnx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanJiang 2018年3月2日
 *
 */

@EnableEurekaClient
@SpringBootApplication
@RestController
public class OrderServer {

	public static void main(String[] args) {
		SpringApplication.run(OrderServer.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + "order的端口" + name + ",i am from port:" + port;
	}

}