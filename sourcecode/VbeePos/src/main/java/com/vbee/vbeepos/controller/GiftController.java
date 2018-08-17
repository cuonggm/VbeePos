package com.vbee.vbeepos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/gifts")
public class GiftController {

	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String newz() {
		return "gift-new";
	}
	
}
