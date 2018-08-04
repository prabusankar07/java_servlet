package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lms.beans.LoginBean;
import com.lms.dao.DBUtil;


public class LoginDAO {
	public String validateLogin(LoginBean obj)
	{
		//All JDBC Codes
		String role="null";
		PreparedStatement ps=null;
		
		try
		{
			
			
		Connection con = DBUtil.getDBConnection();
		ps = con.prepareStatement("select * from lmslogin where username=? and password=? ");
		 ps.setString(1,obj.getUserName());
		 ps.setString(2,obj.getPassword());
		ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			role=rs.getString(3);
			System.out.println(role);
		}
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return role;
		
	}
}
