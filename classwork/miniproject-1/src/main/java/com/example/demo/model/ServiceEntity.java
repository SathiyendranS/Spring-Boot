package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="freelancers")
public class ServiceEntity {

	@Id
	private int freelancerid;
	private String title;
	private String description;
	private float hourlyrate;
	private String accounttype;
	public ServiceEntity(int freelancerid, String title, String description, float hourlyrate, String accounttype) {
		super();
		this.freelancerid = freelancerid;
		this.title = title;
		this.description = description;
		this.hourlyrate = hourlyrate;
		this.accounttype = accounttype;
	}
	public ServiceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFreelancerid() {
		return freelancerid;
	}
	public void setFreelancerid(int freelancerid) {
		this.freelancerid = freelancerid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getHourlyrate() {
		return hourlyrate;
	}
	public void setHourlyrate(float hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	
}
