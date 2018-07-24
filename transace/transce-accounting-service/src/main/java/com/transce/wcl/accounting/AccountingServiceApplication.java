package com.transce.wcl.accounting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.transce.wcl.accounting.mapper")
public class AccountingServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountingServiceApplication.class, args);
	}
}
