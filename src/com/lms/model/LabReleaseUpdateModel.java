package com.lms.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabReleaseRequestBean;
import com.lms.beans.LabRequestBean;
import com.lms.dao.LabExtensionUpdateDAO;
import com.lms.dao.LabReleaseUpdateDAO;

public class LabReleaseUpdateModel {

	public List<LabReleaseRequestBean> getLabReleaseDetails() {
		LabReleaseUpdateDAO leud = new LabReleaseUpdateDAO();
		
		return leud.getLabReleaseDetails();
	}

	public boolean getLabReleaseDetails(HttpServletRequest request,
			HttpServletResponse response) {
LabReleaseUpdateDAO leud = new LabReleaseUpdateDAO();
		
		return leud.getLabReleaseDetails(request, response);
	}

	public List<LabRequestBean> getLabReleaseDetailsById(String searchId) {
		// TODO Auto-generated method stub
		LabReleaseUpdateDAO leud = new LabReleaseUpdateDAO();
		
		return leud.getLabReleaseDetailsById(searchId);
	}

}
