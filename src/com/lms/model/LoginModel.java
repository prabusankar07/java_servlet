package com.lms.model;

import com.lms.beans.LoginBean;
import com.lms.dao.LoginDAO;

public class LoginModel {

	public String validateLogin(LoginBean obj)
	{
		LoginDAO ld = new LoginDAO();
		
		return ld.validateLogin(obj);
	}
	
}
