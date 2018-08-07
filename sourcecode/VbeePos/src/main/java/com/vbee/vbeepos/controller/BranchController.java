package com.vbee.vbeepos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/branches")
public class BranchController {

	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String newBranch() {
		return "branches-new";
	}
	
}
