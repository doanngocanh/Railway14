package com.anhdoanthingoc.finalexam.backend.bussiness;

import java.util.List;

import com.anhdoanthingoc.finalexam.backend.datalayer.UserDaoImpl;
import com.anhdoanthingoc.finalexam.entity.User;

public class Serviceimpl implements IService {
	IServiceController iServiceController;
	UserDaoImpl userDaoImpl;

	public Serviceimpl(IServiceController iServiceController) {
		userDaoImpl = new UserDaoImpl();
		this.iServiceController = iServiceController;
	}

	public List<User> getListEmployeeAndManager(int projectId) {
		List<User> listEmployeeAndManager = userDaoImpl.getEmployeeAndManager(projectId);
		iServiceController.getListEmployeeAndManager(projectId);
		return listEmployeeAndManager;

	}
}
