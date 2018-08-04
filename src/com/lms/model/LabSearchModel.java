package com.lms.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.dao.LabSearchDAO;
import com.lms.beans.LabDetailsBean;

public class LabSearchModel {

	public List<LabDetailsBean> getLabSearchDetails() {
		// TODO Auto-generated method stub
		LabSearchDAO lsd = new LabSearchDAO();
		
		return lsd.getLabSearchDetails();

}

	public List<LabDetailsBean> getLabSearchDetailByID(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LabSearchDAO lsd = new LabSearchDAO();
		
		return lsd.getLabSearchDetailsByID(request, response);
	}

	public List<LabDetailsBean> getLabSearchDetailByPlace(
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		LabSearchDAO lsd = new LabSearchDAO();
		
		return lsd.getLabSearchDetailsByPlace(request, response);
	}
}
