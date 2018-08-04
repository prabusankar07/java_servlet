package com.lms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.IOException;

import com.lms.dao.DBUtil;
import com.lms.beans.LabRequestBean;

public class LabRequestDAO {
	public boolean labRequest(LabRequestBean lrb) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		try{
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into lmsrequest values(?,?,?,?,?,?,?,?,?)");
		
		 ps.setString(1, lrb.getBookingId());
		 ps.setString(2, lrb.getLabId());
		 ps.setString(3, lrb.getLocation() );
		 ps.setString(4, lrb.getLabName());
		 ps.setString(5, lrb.getTrainingName() );
		 ps.setString(6, lrb.getLoName());
		 ps.setString(7, lrb.getStartDate());
		 ps.setString(8, lrb.getEndDate());
		
		 ps.setString(9,"waiting for approval");
			
		 
		 int res1 = ps.executeUpdate();
		 
		 if(res1 == 1)
		 {
			 flag = true;
		 }
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return flag;
	}

}
