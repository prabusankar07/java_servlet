package com.lms.service;


import com.lms.beans.LabDetailsBean;
import com.lms.model.LabDetailsModel;
import com.lms.model.LabUpdateModel;

public class LabUpdateService {

	public boolean updateLab(LabDetailsBean ldb) {
		LabUpdateModel ldm=new LabUpdateModel();
		return ldm.updateLab(ldb);
		}

	

}
