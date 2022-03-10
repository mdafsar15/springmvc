package com.genx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/home")
	public String product() {
		return "help";
	}

	// 1.Model
	@RequestMapping("/get")
	public String get(Model model) {

		model.addAttribute("name", "Amit");
		model.addAttribute("mobile", "8118838819");

		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");

		model.addAttribute("l", list);

		return "help";
	}
}
