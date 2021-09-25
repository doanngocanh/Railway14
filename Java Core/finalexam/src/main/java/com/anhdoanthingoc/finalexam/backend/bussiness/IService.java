package com.anhdoanthingoc.finalexam.backend.bussiness;

import java.util.List;

import com.anhdoanthingoc.finalexam.entity.User;

public interface IService {

	List<User> getListEmployeeAndManager(int projectId);

}
