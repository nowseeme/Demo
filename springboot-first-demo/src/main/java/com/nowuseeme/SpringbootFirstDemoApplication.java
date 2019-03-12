package com.nowuseeme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.nowuseeme.dao")
@SpringBootApplication
public class SpringbootFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstDemoApplication.class, args);
	}
}
