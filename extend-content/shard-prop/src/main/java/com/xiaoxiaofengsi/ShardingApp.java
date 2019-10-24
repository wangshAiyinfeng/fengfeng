package com.xiaoxiaofengsi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xiaoxiaofengsi.mapper")
public class ShardingApp {
	public static void main(String[] args) {
		SpringApplication.run(ShardingApp.class, args);
	}
}
