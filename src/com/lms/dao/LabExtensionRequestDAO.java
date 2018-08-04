package com.lms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.IOException;

import com.lms.dao.DBUtil;
import com.lms.beans.LabExtensionRequestBean;



public class LabExtensionRequestDAO {
	
	public boolean labExtension(LabExtensionRequestBean leb) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		try{
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into lmsextensionrequest values(?,?,?,?,?,?,?,?,?,?)");
		
		 ps.setString(1, leb.getBookingId() );
		 ps.setString(2, leb.getLabId());
		 ps.setString(3, leb.getLabName() );
		 ps.setString(4, leb.getLocation());
		 ps.setString(5, leb.getTrainingName());
		 ps.setString(6, leb.getLoName());
		 ps.setString(7, leb.getStartDate() );
		 ps.setString(8, leb.getEndDate());
		 ps.setString(9, leb.getExtensionDate());
		 ps.setString(10,"waiting for approval");
			
		
		 
		 int res2 = ps.executeUpdate();
		 
		 if(res2 == 1)
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
