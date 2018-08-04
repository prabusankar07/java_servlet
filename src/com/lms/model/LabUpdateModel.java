package com.lms.model;

import com.lms.beans.LabDetailsBean;
import com.lms.dao.LabDeleteDAO;
import com.lms.dao.LabUpdateDAO;

public class LabUpdateModel {

	public boolean updateLab(LabDetailsBean ldb) {
		// TODO Auto-generated method stub
		LabUpdateDAO lud = new LabUpdateDAO();
		return lud.updateLab(ldb);
	}


}
