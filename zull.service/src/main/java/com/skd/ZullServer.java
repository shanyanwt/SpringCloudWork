package com.skd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网管注册中心
 *
 * @author YanJiang 2018年3月2日
 *
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZullServer {

	public static void main(String[] args) {
		SpringApplication.run(ZullServer.class, args);
	}
}