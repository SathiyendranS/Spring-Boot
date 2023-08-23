package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdeatils")
public class FreeEntity {
	@Id
	private int id;
	private String username;
	private String Email;
	private long phonenumber;
	private String Accounttype;
	public FreeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FreeEntity(int id, String username, String email, long phonenumber, String accounttype) {
		super();
		this.id = id;
		this.username = username;
		Email = email;
		this.phonenumber = phonenumber;
		Accounttype = accounttype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	

}
