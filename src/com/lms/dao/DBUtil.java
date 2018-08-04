package com.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	  public static Connection getDBConnection()
	  {
		  Connection con=null;
		  try
		  {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@172.16.154.11:1521:elp";;
		    String userName="elp1781";
		    String password="msat123$";
		    
			 con = DriverManager.getConnection(url,userName,password);
			System.out.println("database connected");  
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
			  System.out.println(e);
		  }
		  
		  
		  return con;
	  }
	
}
