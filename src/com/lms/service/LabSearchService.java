package com.lms.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.model.LabSearchModel;
import com.lms.beans.LabDetailsBean;

public class LabSearchService {

	public List<LabDetailsBean> getLabDetails() {
		// TODO Auto-generated method stub
		LabSearchModel lsm = new LabSearchModel();
		 
		 return lsm.getLabSearchDetails();
		
	}

	public List<LabDetailsBean> getLabDetailsByID(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LabSearchModel lsm = new LabSearchModel();
		 
		 return lsm.getLabSearchDetailByID(request, response);
	}

	public List<LabDetailsBean> getLabDetailsByPlace(
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		LabSearchModel lsm = new LabSearchModel();
		 
		 return lsm.getLabSearchDetailByPlace(request, response);
	}

}
