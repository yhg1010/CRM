package com.backend;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@MapperScan("com.backend.mapper") //扫描的mapper
@SpringBootApplication
public class BackendJavaApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(BackendJavaApplication.class, args);
	}
}