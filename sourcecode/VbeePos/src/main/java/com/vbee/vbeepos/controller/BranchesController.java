package com.vbee.vbeepos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/branches")
public class BranchesController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "branches-index";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newz() {
		return "branches-new";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String create(@RequestParam("branch-name") String name, @RequestParam("branch-address") String address) {
		return "branches-index";
	}

}
