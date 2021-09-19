package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Id
	String uid;
	@Column
	String pwd;
	@Column
	String role;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String uid, String pwd, String role) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.role = role;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
