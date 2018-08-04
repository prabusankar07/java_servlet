package com.lms.service;

import com.lms.beans.LabExtensionRequestBean;

import com.lms.model.LabExtensionRequestModel;

public class LabExtensionRequestService {
	
	public boolean labExtension(LabExtensionRequestBean leb) {
		LabExtensionRequestModel lem=new LabExtensionRequestModel();
		return lem.labExtension(leb);
	}


}
