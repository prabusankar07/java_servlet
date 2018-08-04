package com.lms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.IOException;

import com.lms.dao.DBUtil;
import com.lms.beans.LabExtensionRequestBean;
import com.lms.beans.LabReleaseRequestBean;

public class LabReleaseRequestDAO {
	public boolean labReleaseRequest(LabReleaseRequestBean lrrb) {
	// TODO Auto-generated method stub
			boolean flag=false;
			
			try{
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement("insert into lmsrelease values(?,?,?,?,?,?,?,?,?,?)");
			
			 ps.setString(1, lrrb.getBookingId() );
			 ps.setString(2, lrrb.getLabId());
			 ps.setString(3, lrrb.getLabName() );
			 ps.setString(4, lrrb.getLocation());
			 ps.setString(5, lrrb.getTrainingName());
			 ps.setString(6, lrrb.getLoName());
			 ps.setString(7, lrrb.getStartDate() );
			 ps.setString(8, lrrb.getEndDate());
			 ps.setString(9, lrrb.getReleaseDate());
			 ps.setString(10,"waiting for approval");	
			
			 
			 int res3 = ps.executeUpdate();
			 
			 if(res3 == 1)
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
