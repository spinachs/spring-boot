package com.bianyuanke.boot;

import com.bianyuanke.boot.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * TODO
 *
 * @author maliang56
 * @date 2020-01-07
 */
@SpringBootApplication
public class Application {
	@Autowired
	private BeanService beanService;
	private String name = "marion";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
