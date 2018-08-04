package com.lms.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.IOException;

import com.lms.dao.DBUtil;
import com.lms.beans.LabReleaseRequestBean;
import com.lms.dao.LabReleaseRequestDAO;

public class LabReleaseRequestModel {
	public boolean labReleaseRequest(LabReleaseRequestBean lrrb) {
		// TODO Auto-generated method stub
		LabReleaseRequestDAO lrrd=new LabReleaseRequestDAO();
		return lrrd.labReleaseRequest(lrrb);
	}


}
