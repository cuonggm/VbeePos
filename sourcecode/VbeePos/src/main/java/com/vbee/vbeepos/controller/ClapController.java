package com.vbee.vbeepos.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vbee.vbeepos.bean.Clapper;
import com.vbee.vbeepos.bean.User;
import com.vbee.vbeepos.service.ClapService;
import com.vbee.vbeepos.service.GiftService;
import com.vbee.vbeepos.service.UserService;

@Controller
@RequestMapping(value = "/claps")
public class ClapController extends BaseController {

	@Autowired
	private ClapService clapService;

	@Autowired
	private GiftService giftService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public String clap(@RequestParam Long giftId, HttpSession session) {
		try {
			Long clapperId = getCurrentAccountId(session);
			clapService.createClap(giftId, clapperId);
			Long clapCount = giftService.getClapCount(giftId);
			User user = userService.findById(clapperId);

			return "{\"clapCount\" : " + clapCount.longValue() + ", \"points\" : " + user.getPoints() + "}";
		} catch (Exception e) {
			return "{}";
		}
	}

	@RequestMapping(value = "/group-by-name/json", method = RequestMethod.GET)
	@ResponseBody
	public String clappers(@RequestParam Long giftId) {
		try {
			List<Clapper> list = clapService.clappers(giftId);
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(list);
		} catch (Exception e) {
			return "[]";
		}
	}

}
