package com.lms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabExtensionRequestBean;
import com.lms.model.LabExtensionUpdateModel;
import com.lms.model.LabSearchModel;

public class LabExtensionUpdateService {

	public List<LabExtensionRequestBean> getExtensionDetails() {
		// TODO Auto-generated method stub
		LabExtensionUpdateModel lerm = new LabExtensionUpdateModel();
		 
		 return lerm.getLabExtensionDetails();
	}

	public boolean getExtensionDetails(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		LabExtensionUpdateModel lerm = new LabExtensionUpdateModel();
		 
		 return lerm.getLabExtensionDetails(request,response);
	}

	

}
