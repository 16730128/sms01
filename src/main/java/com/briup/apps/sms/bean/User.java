package com.briup.apps.sms.bean;

public class User {
	private Longint id;
	private varchar realname;
	private varchar telephone;
	private varchar password;
	private int student_no;
	private varchar gender;
	private bigint clazz_id;
	public Longint getId() {
		return id;
	}
	public void setId(Longint id) {
		this.id = id;
	}
	public varchar getRealname() {
		return realname;
	}
	public void setRealname(varchar realname) {
		this.realname = realname;
	}
	public varchar getTelephone() {
		return telephone;
	}
	public void setTelephone(varchar telephone) {
		this.telephone = telephone;
	}
	public varchar getPassword() {
		return password;
	}
	public void setPassword(varchar password) {
		this.password = password;
	}
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public varchar getGender() {
		return gender;
	}
	public void setGender(varchar gender) {
		this.gender = gender;
	}
	public bigint getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(bigint clazz_id) {
		this.clazz_id = clazz_id;
	}
}
