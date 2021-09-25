package com.anhdoanthingoc.finalexam.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.anhdoanthingoc.finalexam.entity.User;

public interface UserDao extends Dao<User> {

	List<User> getAll();

	public List<User> getEmployeeAndManager(int projectId) ;
	
	public List<User> getManager (String roleName);
	

}
