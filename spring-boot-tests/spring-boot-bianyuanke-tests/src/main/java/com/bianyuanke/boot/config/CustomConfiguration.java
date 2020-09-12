package com.bianyuanke.boot.config;

import com.bianyuanke.boot.service.BeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author maliang56
 * @date 2020-01-08
 */
@ComponentScan(basePackages = {"com.bianyuanke.boot"})
@Configuration
public class CustomConfiguration {
	@Bean
	public BeanService beanService() {
		return new BeanService();
	}
}
