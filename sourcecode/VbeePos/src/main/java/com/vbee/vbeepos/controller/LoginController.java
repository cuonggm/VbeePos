package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.service.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginForm() {
		return "login";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String loginSubmit(@RequestParam String email, @RequestParam String password,
			RedirectAttributes redirectAttributes, HttpSession session) {
		Account currentUser = loginService.login(email, password);
		if (currentUser != null) {
			redirectAttributes.addFlashAttribute("flash", "success");
			redirectAttributes.addFlashAttribute("message", "Logging in successfully");
			session.setAttribute("currentUser", currentUser.getId());
		} else {
			redirectAttributes.addFlashAttribute("flash", "danger");
			redirectAttributes.addFlashAttribute("message", "Logging in failed");
			return "redirect:/login/";
		}
		return "redirect:/";
	}

}
