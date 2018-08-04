package com.lms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.beans.LabReleaseRequestBean;
import com.lms.beans.LabRequestBean;
import com.lms.model.LabExtensionUpdateModel;
import com.lms.model.LabReleaseUpdateModel;

public class LabReleaseUpdateService {

	public List<LabReleaseRequestBean> getRequestDetails() {
		// TODO Auto-generated method stub
		LabReleaseUpdateModel lerm = new LabReleaseUpdateModel();
		 
		 return lerm.getLabReleaseDetails();
	}

	public boolean getReleaseDetails(HttpServletRequest request,
			HttpServletResponse response) {
		LabReleaseUpdateModel lerm = new LabReleaseUpdateModel();
		 
		 return lerm.getLabReleaseDetails(request,response);
	}

	public List<LabRequestBean> getRequestDetailsById(String searchId) {
		LabReleaseUpdateModel lerm = new LabReleaseUpdateModel();
		 
		 return lerm.getLabReleaseDetailsById(searchId);
	}

}
