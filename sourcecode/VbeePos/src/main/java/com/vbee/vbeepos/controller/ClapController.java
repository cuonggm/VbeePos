package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vbee.vbeepos.service.ClapService;
import com.vbee.vbeepos.service.GiftService;

@Controller
@RequestMapping(value = "/claps")
public class ClapController extends BaseController {

	@Autowired
	private ClapService clapService;

	@Autowired
	private GiftService giftService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public String clap(@RequestParam Long giftId, HttpSession session) {
		try {
			Long clapperId = getCurrentAccountId(session);
			clapService.createClap(giftId, clapperId);
			return String.valueOf(giftService.getClapCount(giftId));
		} catch (Exception e) {
			return null;
		}
	}

}
