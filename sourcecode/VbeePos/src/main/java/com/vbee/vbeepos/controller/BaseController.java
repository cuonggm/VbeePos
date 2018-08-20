package com.vbee.vbeepos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.service.AccountService;

public class BaseController {

	public Long getCurrentAccountId(HttpSession session) {
		return (Long) session.getAttribute("currentUser");
	}

}
