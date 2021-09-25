package com.anhdoanthingoc.finalexam.backend.presentation;

import java.util.List;

import com.anhdoanthingoc.finalexam.entity.User;

public interface IView {
	void getListEmployeeAndManager(int projectId);

	void getListEmployeeAndManagerIsNull();

	void getListEmployeeAndManagerSuccess(List<User> listEmployeeAndManager);

	
	
}
