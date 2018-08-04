package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.beans.LabRequestBean;

public class LabRequestUpdateDAO {

	public List<LabRequestBean> getLabRequestDetails() {
		List<LabRequestBean> li = new ArrayList<LabRequestBean>();
		try
		{
			Connection con = DBUtil.getDBConnection();
			Statement stat = con.createStatement();
			ResultSet rs = 	 stat.executeQuery("select * from lmsrequest");
			 while(rs.next())
			  {
				 
				 String bookingId=  rs.getString(1);
				 String labId = rs.getString(2);
				 String labName = rs.getString(3);
				 String location= rs.getString(4);
				 String trainingName = rs.getString(5);
				 String loName=  rs.getString(6);
				 String startDate = rs.getString(7);
				 String endDate = rs.getString(8);
				 String approval = rs.getString(9);
				 LabRequestBean leb= new LabRequestBean(bookingId,labId,labName,location,trainingName,loName,startDate,endDate,approval);
				 li.add(leb);
			  }
		
		
	}catch(Exception e)
	{
		 e.printStackTrace();
	}
	
	
	return li;
}
	

	public boolean getLabRequestDetails(HttpServletRequest request,
			HttpServletResponse response) {
		boolean flag=false;
		try
		{
			
			HttpSession session = request.getSession(false);
			Connection con = DBUtil.getDBConnection();
			String[] approve=(String[]) session.getAttribute("approve");	
			for(String app:approve)
			{
				System.out.println(app);
				PreparedStatement ps = con.prepareStatement("update lmsrequest set	approval=? where bookingid=?");
				 ps.setString(1, "approved");
				ps.setString(2, app);
				int res = ps.executeUpdate();
				 
				 if(res==1)
				 {
					 flag = true;
				 }
				
				 
			}
			
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		return flag;
}
}
	
