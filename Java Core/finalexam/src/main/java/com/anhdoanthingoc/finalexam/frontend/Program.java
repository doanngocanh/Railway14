package com.anhdoanthingoc.finalexam.frontend;

import java.util.List;

import com.anhdoanthingoc.finalexam.backend.presentation.Controllerimpl;
import com.anhdoanthingoc.finalexam.backend.presentation.IController;
import com.anhdoanthingoc.finalexam.backend.presentation.IView;
import com.anhdoanthingoc.finalexam.entity.User;
import com.anhdoanthingoc.finalexam.utils.ScannerUtil;

public class Program implements IView {
	IController controllerImpl;

	public Program() {
		controllerImpl = new Controllerimpl(this);
	}

	public void getListEmployeeAndManager(int projectId) {
		System.out.println("Nhập project ID");

		int Id = ScannerUtil.scInt();
		controllerImpl.getListEmployeeAndManager(projectId);

	}

	public void getListEmployeeAndManagerIsNull() {
		System.out.println("Không có Employee và Manager nào trong project này");

	}

	public void getListEmployeeAndManagerSuccess(List<User> listEmployeeAndManager) {
		System.out.println("Danh sách employee và manager");
		for (User user : listEmployeeAndManager) {
			System.out.println(user);

		}

	}
}
