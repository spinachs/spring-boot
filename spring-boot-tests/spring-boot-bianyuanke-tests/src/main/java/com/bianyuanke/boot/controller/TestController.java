package com.bianyuanke.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author maliang56
 * @date 2020-01-07
 */
@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/sayhi")
	public String hello(String name) {
		return String.format("hi %s", name);
	}
}
