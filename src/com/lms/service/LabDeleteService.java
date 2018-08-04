package com.lms.service;

import com.lms.beans.LabDetailsBean;
import com.lms.model.LabDeleteModel;

public class LabDeleteService {

	public boolean deleteLab(LabDetailsBean ldb) {
		LabDeleteModel ldm = new LabDeleteModel();
		return ldm.deleteLab(ldb);
	}

}
