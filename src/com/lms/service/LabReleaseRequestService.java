package com.lms.service;

import com.lms.beans.LabReleaseRequestBean;

import com.lms.model.LabReleaseRequestModel;

public class LabReleaseRequestService {
	public boolean labReleaseRequest(LabReleaseRequestBean lrrb) {
		LabReleaseRequestModel lrrm=new LabReleaseRequestModel();
		return lrrm.labReleaseRequest(lrrb);
	}

	

}
