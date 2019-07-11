package com.briup.apps.sms.bean;
/*
 * 课程类*/
public class Course {
	private Long id;
	private String name;
	private double credit;
	private Long user_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public Long getUserid() {
		return user_id;
	}
	public void setUserid(Long userid) {
		this.user_id = userid;
	}
	
}
