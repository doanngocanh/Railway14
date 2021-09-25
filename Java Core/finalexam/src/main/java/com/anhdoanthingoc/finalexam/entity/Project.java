package com.anhdoanthingoc.finalexam.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Project extends User {

	
	int projectId;
	int teamSize;
	int idManager;
	int idEmployees;

	public Project(ResultSet resultSet) throws SQLException {
		super(resultSet);
		this.projectId = resultSet.getInt("projectId");
		this.teamSize = resultSet.getInt("teamSize");
		
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(ResultSet resultSet) throws SQLException {
		this.idManager = resultSet.getInt("userId");
	}

	public int getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(ResultSet resultSet) throws SQLException {
		this.idEmployees = resultSet.getInt("userId");
	}
	
	
}
