package com.lms.model;

import com.lms.beans.LabDetailsBean;
import com.lms.dao.LabDeleteDAO;

public class LabDeleteModel {

	public boolean deleteLab(LabDetailsBean ldb) {

		LabDeleteDAO ldd = new LabDeleteDAO();
		return ldd.deletelab(ldb);
	}

}
