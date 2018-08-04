package com.lms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabRequestBean;

import com.lms.model.LabRequestUpdateModel;

public class LabRequestUpdateService {

	public List<LabRequestBean> getRequestDetails() {
		LabRequestUpdateModel lerm = new LabRequestUpdateModel();
		 
		 return lerm.getLabRequestDetails();
	}

	public boolean getRequestDetails(HttpServletRequest request,
			HttpServletResponse response) {
		LabRequestUpdateModel lerm = new LabRequestUpdateModel();
		 
		 return lerm.getLabRequestDetails(request,response);
	}

}
