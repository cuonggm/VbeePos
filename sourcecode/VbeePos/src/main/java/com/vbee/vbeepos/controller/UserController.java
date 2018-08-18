package com.vbee.vbeepos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vbee.vbeepos.bean.User;
import com.vbee.vbeepos.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {

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

}
