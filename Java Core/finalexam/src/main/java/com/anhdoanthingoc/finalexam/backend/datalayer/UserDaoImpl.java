package com.anhdoanthingoc.finalexam.backend.datalayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.anhdoanthingoc.finalexam.entity.Project;
import com.anhdoanthingoc.finalexam.entity.User;
import com.anhdoanthingoc.finalexam.utils.JDBCUtil;

public class UserDaoImpl implements UserDao {

	public List<User> getManager(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insert(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getEmployeeAndManager(int projectId) {
		List<User> listEmployeeAndManager = new ArrayList<User>();
		String query = "SELECT u.id, u.`fullName`, u.`email`, u.`password` FROM ProjectAndUser pau JOIN User u ON u.id = pau.userId WHERE pau.projectId = ?;";

		PreparedStatement prepareStatement;
		try {
			prepareStatement = JDBCUtil.getIntance().getPreparedStatement(query);
			prepareStatement.setInt(1, projectId);

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {

				listEmployeeAndManager.add(new User(resultSet));
			}


		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listEmployeeAndManager;

	}

}
