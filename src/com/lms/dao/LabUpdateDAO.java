package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.lms.beans.LabDetailsBean;


public class LabUpdateDAO {

	public boolean updateLab(LabDetailsBean ldb) {
		boolean flag=false;
		try{
			Connection con = DBUtil.getDBConnection();
			System.out.println(ldb.getCapacity());
			PreparedStatement ps = con.prepareStatement("update lmsdetails set labname=?,type=?,country=?,city=?,capacity=?,status=?,projector=?,phone=?,mike=?,soundsystem=?,videoconference=?,airconditioner=?,systemavailable=?,whiteboard=? where labid=?");
			 System.out.println(ldb.getCapacity());
			 ps.setString(1, ldb.getLabName());
			 ps.setString(2, ldb.getType());
			 ps.setString(3, ldb.getCountry());
			 ps.setString(4, ldb.getCity());
			 ps.setString(5, ldb.getCapacity());
			 ps.setString(6, ldb.getStatus());
			 ps.setString(7, ldb.getProjector());
			 ps.setString(8, ldb.getPhone());
			 ps.setString(9, ldb.getMike());
			 ps.setString(10, ldb.getSoundSystem());
			 ps.setString(11, ldb.getVideoConference());
			 ps.setString(12, ldb.getAirConditioner());
			 ps.setString(13, ldb.getSystemsAvailable());
			 ps.setString(14, ldb.getWhiteBoard());
			 ps.setString(15, ldb.getLabId());
			
	
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
