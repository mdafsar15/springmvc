package com.genx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Registration {

	@RequestMapping("/")
	public String register() {
		return "register";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String reg(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("mobile") String mobile, @RequestParam("password") String password, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("mobile", mobile);
		model.addAttribute("password", password);

		return "success";

	}

}
