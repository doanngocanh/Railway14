package com.anhdoanthingoc.finalexam.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	int id;
	String fullName;
	String email;
	String passWord;

	public User(int id, String fullName, String email, String passWord) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.passWord = passWord;
	}

	public User(ResultSet resultSet) throws SQLException {

		super();
		this.id = resultSet.getInt("id");
		this.fullName = resultSet.getString("fullName");
		this.email = resultSet.getString("email");
		this.passWord = resultSet.getString("password");

	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", passWord=" + passWord + "]";
	}

}
