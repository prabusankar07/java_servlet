package com.lms.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabRequestBean;
import com.lms.dao.LabExtensionUpdateDAO;
import com.lms.dao.LabRequestUpdateDAO;

public class LabRequestUpdateModel {

	public List<LabRequestBean> getLabRequestDetails() {
		LabRequestUpdateDAO leud = new LabRequestUpdateDAO();
		
		return leud.getLabRequestDetails();
	}

	public boolean getLabRequestDetails(HttpServletRequest request,
			HttpServletResponse response) {
		LabRequestUpdateDAO leud = new LabRequestUpdateDAO();
		
		return leud.getLabRequestDetails(request, response);
	}

}
