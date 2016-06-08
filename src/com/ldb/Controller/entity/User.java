package com.ldb.Controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="T_USER")
public class User {

	@Column(length=32)
	private String username;
	@Column(length=32)
	private String password;
	@Column(length=32)
	@Id
	@GeneratedValue(generator = "system-uuid")    
	@GenericGenerator(name = "system-uuid", strategy = "uuid")  
	private String userid;
	
	public User() {
	}

	public User(String username, String password, String userid) {
		this.username = username;
		this.password = password;
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", userid=" + userid + "]";
	}
	
	
	
}
