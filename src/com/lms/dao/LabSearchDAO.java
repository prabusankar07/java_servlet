package com.lms.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.dao.DBUtil;


import com.lms.beans.LabDetailsBean;

public class LabSearchDAO extends HttpServlet {

	public List<LabDetailsBean> getLabSearchDetails() {
		// TODO Auto-generated method stub
		List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
		try
		{
			Connection con = DBUtil.getDBConnection();
			Statement stat = con.createStatement();
			ResultSet rs = 	 stat.executeQuery("select * from lmsdetails");
			 while(rs.next())
			  {
				 
				 String labID=  rs.getString(1);
				 String labName = rs.getString(2);
				 String type = rs.getString(3);
				 String country= rs.getString(4);
				 String city = rs.getString(5);
				 String capacity=  rs.getString(6);
				 String status = rs.getString(7);
				 String projector = rs.getString(8);
				 String phone= rs.getString(9);
				 String mike = rs.getString(10);
				 String soundSystem=  rs.getString(11);
				 String videoConference = rs.getString(12);
				 String airConditioner = rs.getString(13);
				 String systemAvailable= rs.getString(14);
				 String whiteBoard = rs.getString(15);
				 LabDetailsBean ldb= new LabDetailsBean(labID,labName,type,capacity,country,city,status,systemAvailable,whiteBoard,airConditioner,projector,phone,mike,soundSystem,videoConference);
				 li.add(ldb);
			  }
		
		
	}catch(Exception e)
	{
		 e.printStackTrace();
	}
	
	
	return li;
}

	public List<LabDetailsBean> getLabSearchDetailsByID(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
		try
		{
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps=null;
			
			HttpSession session = request.getSession(false);
			String searchid=(String) session.getAttribute("searchid");
			System.out.println(searchid);
			ps = con.prepareStatement("select * from lmsdetails where labid=? ");
			 ps.setString(1,searchid);
			 ResultSet rs = ps.executeQuery();
		 while(rs.next())
			  {
				 
				 String labID=  rs.getString(1);
				 String labName = rs.getString(2);
				 String type = rs.getString(3);
				 String country= rs.getString(4);
				 String city = rs.getString(5);
				 String capacity=  rs.getString(6);
				 String status = rs.getString(7);
				 String projector = rs.getString(8);
				 String phone= rs.getString(9);
				 String mike = rs.getString(10);
				 String soundSystem=  rs.getString(11);
				 String videoConference = rs.getString(12);
				 String airConditioner = rs.getString(13);
				 String systemAvailable= rs.getString(14);
				 String whiteBoard = rs.getString(15);
				 LabDetailsBean ldb= new LabDetailsBean(labID,labName,type,capacity,country,city,status,systemAvailable,whiteBoard,airConditioner,projector,phone,mike,soundSystem,videoConference);
				 li.add(ldb);
			  }
		
		
	}catch(Exception e)
	{
		 e.printStackTrace();
	}
	
	
	return li;
	}

	public List<LabDetailsBean> getLabSearchDetailsByPlace(
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
		try
		{
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps=null;
			
			HttpSession session = request.getSession(false);
			String searchid=(String) session.getAttribute("searchid");
			System.out.println(searchid);
			ps = con.prepareStatement("select * from lmsdetails where city=? ");
			 ps.setString(1,searchid);
			 ResultSet rs = ps.executeQuery();
		 while(rs.next())
			  {
				 
				 String labID=  rs.getString(1);
				 String labName = rs.getString(2);
				 String type = rs.getString(3);
				 String country= rs.getString(4);
				 String city = rs.getString(5);
				 String capacity=  rs.getString(6);
				 String status = rs.getString(7);
				 String projector = rs.getString(8);
				 String phone= rs.getString(9);
				 String mike = rs.getString(10);
				 String soundSystem=  rs.getString(11);
				 String videoConference = rs.getString(12);
				 String airConditioner = rs.getString(13);
				 String systemAvailable= rs.getString(14);
				 String whiteBoard = rs.getString(15);
				 LabDetailsBean ldb= new LabDetailsBean(labID,labName,type,capacity,country,city,status,systemAvailable,whiteBoard,airConditioner,projector,phone,mike,soundSystem,videoConference);
				 li.add(ldb);
			  }
		
		
	}catch(Exception e)
	{
		 e.printStackTrace();
	}
	
	
	return li;
	}

	}



