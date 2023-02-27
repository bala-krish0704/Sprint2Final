package com.cg.onlinebookstoremanagementsysapp.entity;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {

	
	//Entity Attributes and Column Names
		@Id
		@Column(name="admin_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long adminId;
		
		@Column(name="name")
		private String adminName;
		
		@Column(name="gender")
		private String adminGender;
		
		@Column(name="email")
		private String adminEmail;
		
		@Column(name="mobile_no")
		private String adminMobileNo;
		
		@Column(name="password")
		private String adminPassword;

		//Constructors
		public Admin() {
		}

		public Admin(long adminId, String adminName, String adminGender, String adminEmail, String adminMobileNo,
				String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminGender = adminGender;
			this.adminEmail = adminEmail;
			this.adminMobileNo = adminMobileNo;
			this.adminPassword = adminPassword;
		}

		

		//Getters and Setters
	
		public long getAdminId() {
			return adminId;
		}

		public void setAdminId(long adminId) {
			this.adminId = adminId;
		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getAdminGender() {
			return adminGender;
		}

		public void setAdminGender(String adminGender) {
			this.adminGender = adminGender;
		}

		public String getAdminEmail() {
			return adminEmail;
		}

		public void setAdminEmail(String adminEmail) {
			this.adminEmail = adminEmail;
		}

		public String getAdminMobileNo() {
			return adminMobileNo;
		}

		public void setAdminMobileNo(String adminMobileNo) {
			this.adminMobileNo = adminMobileNo;
		}

		public String getAdminPassword() {
			return adminPassword;
		}

		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		
}
