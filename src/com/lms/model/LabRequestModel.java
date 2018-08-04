package com.lms.model;

import com.lms.beans.LabRequestBean;
import com.lms.dao.LabRequestDAO;

public class LabRequestModel {
	public boolean labRequest(LabRequestBean lrb) {
		// TODO Auto-generated method stub
		LabRequestDAO lrd=new LabRequestDAO();
		return lrd.labRequest(lrb);
	}


}
