package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.vbee.vbeepos.bean.User;
import com.vbee.vbeepos.service.UserService;

@Controller
public class BaseController {

	@Autowired
	private UserService userService;

	public Long getCurrentAccountId(HttpSession session) {
		return (Long) session.getAttribute("currentUser");
	}

	@ModelAttribute
	public void setupUserProfile(HttpSession session, Model model) {
		try {
			Long id = getCurrentAccountId(session);
			User user = userService.findById(id);
			model.addAttribute("userProfile", user);
		} catch (Exception e) {

		}
	}

}
