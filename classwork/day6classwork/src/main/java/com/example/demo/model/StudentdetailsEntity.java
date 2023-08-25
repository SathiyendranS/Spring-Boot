package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="studentdetails")
public class StudentdetailsEntity
{
		@Id
		private int babyid;
		private String firstname;
		private String babylastname;
		private String fathername;
		private String mothername;
		private String address;
		public StudentdetailsEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StudentdetailsEntity(int babyid, String firstname, String babylastname, String fathername, String mothername,
				String address) {
			super();
			this.babyid = babyid;
			this.firstname = firstname;
			this.babylastname = babylastname;
			this.fathername = fathername;
			this.mothername = mothername;
			this.address = address;
		}
		public int getBabyid() {
			return babyid;
		}
		public void setBabyid(int babyid) {
			this.babyid = babyid;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getBabylastname() {
			return babylastname;
		}
		public void setBabylastname(String babylastname) {
			this.babylastname = babylastname;
		}
		public String getFathername() {
			return fathername;
		}
		public void setFathername(String fathername) {
			this.fathername = fathername;
		}
		public String getMothername() {
			return mothername;
		}
		public void setMothername(String mothername) {
			this.mothername = mothername;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		
}


