package com.anhdoanthingoc.finalexam.backend.presentation;

import java.util.List;

import com.anhdoanthingoc.finalexam.backend.bussiness.IService;
import com.anhdoanthingoc.finalexam.backend.bussiness.IServiceController;
import com.anhdoanthingoc.finalexam.backend.bussiness.Serviceimpl;
import com.anhdoanthingoc.finalexam.entity.User;

public class Controllerimpl implements IController, IServiceController {
	IView iView;
	IService serviceImpl;
	IServiceController iServiceController;

	public Controllerimpl(IView iView) {
		serviceImpl = new Serviceimpl(this);
		this.iView = iView;
	}

	public void getListEmployeeAndManager(int projectId) {
		List<User> listEmployeeAndManager = serviceImpl.getListEmployeeAndManager(projectId);
		if (listEmployeeAndManager.isEmpty()) {
			iView.getListEmployeeAndManagerIsNull();

		} else {
			iView.getListEmployeeAndManagerSuccess(listEmployeeAndManager);

		}

	}

}
