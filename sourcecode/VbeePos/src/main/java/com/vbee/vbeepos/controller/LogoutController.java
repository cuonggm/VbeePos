package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/logout")
public class LogoutController {
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String logout(HttpSession session) {
		session.removeAttribute("currentUser");
		return "redirect:/login/";
	}

}
