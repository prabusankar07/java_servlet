package com.lms.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabExtensionRequestBean;
import com.lms.dao.LabExtensionUpdateDAO;
import com.lms.dao.LabSearchDAO;
import com.lms.dao.LabUpdateDAO;

public class LabExtensionUpdateModel {

	public List<LabExtensionRequestBean> getLabExtensionDetails() {
		LabExtensionUpdateDAO leud = new LabExtensionUpdateDAO();
		
		return leud.getLabExtensionDetails();

	}

	public boolean getLabExtensionDetails(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
LabExtensionUpdateDAO leud = new LabExtensionUpdateDAO();
		
		return leud.getLabExtensionDetails(request, response);
	}

}
