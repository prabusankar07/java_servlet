package com.lms.service;

import com.lms.beans.LabRequestBean;
import com.lms.model.LabRequestModel;

public class LabRequestService {
	
	public boolean labRequest(LabRequestBean lrb) {
		LabRequestModel lrm=new LabRequestModel();
		return lrm.labRequest(lrb);
	}


}
