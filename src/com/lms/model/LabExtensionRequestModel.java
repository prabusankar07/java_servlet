package com.lms.model;

import com.lms.beans.LabExtensionRequestBean;

import com.lms.dao.LabExtensionRequestDAO;

public class LabExtensionRequestModel {
	
	public boolean labExtension(LabExtensionRequestBean leb) {
		// TODO Auto-generated method stub
		LabExtensionRequestDAO led=new LabExtensionRequestDAO();
		return led.labExtension(leb);
	}


}
