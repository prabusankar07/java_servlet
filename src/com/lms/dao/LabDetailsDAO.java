package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.lms.dao.DBUtil;
import com.lms.beans.LabDetailsBean;

public class LabDetailsDAO {

	public boolean addLab(LabDetailsBean ldb) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		try{
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into lmsdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		 ps.setString(1, ldb.getLabId());
		 ps.setString(2, ldb.getLabName());
		 ps.setString(3, ldb.getType());
		 ps.setString(4, ldb.getCountry());
		 ps.setString(5, ldb.getCity());
		 ps.setString(6, ldb.getCapacity());
		 ps.setString(7, ldb.getStatus());
		 ps.setString(8, ldb.getProjector());
		 ps.setString(9, ldb.getPhone());
		 ps.setString(10, ldb.getMike());
		 ps.setString(11, ldb.getSoundSystem());
		 ps.setString(12, ldb.getVideoConference());
		 ps.setString(13, ldb.getAirConditioner());
		 ps.setString(14, ldb.getSystemsAvailable());
		 ps.setString(15, ldb.getWhiteBoard());
		 
		 
		 int res = ps.executeUpdate();
		 
		 if(res==1)
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
