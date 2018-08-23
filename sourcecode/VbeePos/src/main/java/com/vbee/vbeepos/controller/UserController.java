package com.vbee.vbeepos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vbee.vbeepos.bean.GiftInfo;
import com.vbee.vbeepos.bean.User;
import com.vbee.vbeepos.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	@ResponseBody
	public String indexJson() {
		List<User> userList = userService.loadAll();

		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			return "[]";
		}
	}

	@RequestMapping(value = "/{id}/receivedGifts", method = RequestMethod.GET)
	public String getReceivedGifts(Model model, @PathVariable Long id) {
		List<GiftInfo> receivedGifts = userService.loadReceivedGifts(id);
		model.addAttribute("receivedGifts", receivedGifts);
		return "received-gifts";
	}

	@RequestMapping(value = "/{id}/sentGifts", method = RequestMethod.GET)
	public String getSentGifts(Model model, @PathVariable Long id) {
		List<GiftInfo> sentGifts = userService.loadSentGifts(id);
		model.addAttribute("sentGifts", sentGifts);
		return "sent-gifts";
	}

	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public String scoreUsers(Model model) {
		try {
			List<User> users = userService.scoredUsers();
			model.addAttribute("users", users);
		} catch (Exception e) {

		}
		return "users-score";
	}
}
