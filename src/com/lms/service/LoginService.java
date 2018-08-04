package com.lms.service;

import com.lms.beans.LoginBean;
import com.lms.model.LoginModel;

public class LoginService {

	public String validateLogin(LoginBean obj)
	{
		LoginModel lm = new LoginModel();
		return lm.validateLogin(obj);
		
		
	}
	
}
