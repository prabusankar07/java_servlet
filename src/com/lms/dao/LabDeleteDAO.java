
package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.lms.beans.LabDetailsBean;

public class LabDeleteDAO {

	public boolean deletelab(LabDetailsBean ldb) {
		boolean flag=false;
		PreparedStatement ps=null;
		
		try
		{
		System.out.println(ldb.getLabId());
		String labID=ldb.getLabId();
		System.out.println(labID);
		Connection con = DBUtil.getDBConnection();
		ps = con.prepareStatement("delete from lmsdetails where labid=? ");
		 ps.setString(1,labID);
		 int res = ps.executeUpdate();
			 if(res==1)
			   {
			 
			 flag = true;
		      }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return flag;
	}
}
