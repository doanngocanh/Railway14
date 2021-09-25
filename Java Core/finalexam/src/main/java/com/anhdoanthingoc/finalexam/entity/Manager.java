package com.anhdoanthingoc.finalexam.entity;

public class Manager extends User {

	int expInyear;

	public Manager(int id, String fullName, String email, String passWord, int expInYear) {
		super(id, fullName, email, passWord);
		this.expInyear = expInYear;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}



	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return super.getFullName();
	}

	@Override
	public void setFullName(String fullName) {
		// TODO Auto-generated method stub
		super.setFullName(fullName);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getPassWord() {
		// TODO Auto-generated method stub
		return super.getPassWord();
	}

	@Override
	public void setPassWord(String passWord) {
		// TODO Auto-generated method stub
		super.setPassWord(passWord);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
