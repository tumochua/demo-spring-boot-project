package com.project.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/welcome/")
public class Welcome {
	@GetMapping("v1")
	public String Welcome(Model model) {
		model.addAttribute("message","Hello word tumochua abc sadsa");
		return "index";
	}

	@GetMapping("v2")
	public String Hello(Model model) {
		model.addAttribute("message", "Welcome to my application!");
		return "hello";
	}

	@GetMapping("header")
	public String getPageHeader(Model model) {
		model.addAttribute("message", "Welcome to my application!");
		return "header/header";
	}
}
