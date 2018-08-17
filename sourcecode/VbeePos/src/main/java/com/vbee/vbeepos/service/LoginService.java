package com.vbee.vbeepos.service;

import com.vbee.vbeepos.model.Account;

public interface LoginService {
	
	Account login(String email, String password);
	
}
