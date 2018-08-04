package com.lms.model;

import com.lms.beans.LabDetailsBean;
import com.lms.dao.LabDetailsDAO;

public class LabDetailsModel {

	public boolean addLab(LabDetailsBean ldb) {
		// TODO Auto-generated method stub
		LabDetailsDAO ldd=new LabDetailsDAO();
		return ldd.addLab(ldb);
	}

}
