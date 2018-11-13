package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller

	public class SampleController {
	
		@RequestMapping("/")
		String home() {
			return "home";
		}
		@RequestMapping("/sample")
		String sample() {
			return "sample";
		}
		
	}
