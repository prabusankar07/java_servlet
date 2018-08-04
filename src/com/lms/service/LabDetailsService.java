package com.lms.service;

import com.lms.beans.LabDetailsBean;
import com.lms.model.LabDetailsModel;
import com.lms.model.LabUpdateModel;

public class LabDetailsService {

	public boolean addLab(LabDetailsBean ldb) {
		LabDetailsModel ldm=new LabDetailsModel();
		return ldm.addLab(ldb);
	}

	

}
