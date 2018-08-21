package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.vbee.vbeepos.service.AccountService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/resetpoints", method = RequestMethod.GET)
	public String resetPoints(HttpSession session, RedirectAttributes redirectAttributes) {
		Long id = getCurrentAccountId(session);
		try {
			int count = accountService.updatePoints(id);
			redirectAttributes.addFlashAttribute("flash", "success");
			redirectAttributes.addFlashAttribute("message", "Resetted points for " + count + " accounts!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("flash", "danger");
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/";
	}

}
