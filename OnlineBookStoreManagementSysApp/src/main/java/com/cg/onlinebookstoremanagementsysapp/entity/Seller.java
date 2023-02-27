package com.cg.onlinebookstoremanagementsysapp.entity;

import javax.persistence.*;

@Entity
@Table(name="seller")
public class Seller {
	//Entity Attributes and Column Names
			@Id
			@Column(name="seller_id")
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long sellerId;
			
			@Column(name="name")
			private String sellerName;
			
			@Column(name="email")
			private String sellerEmail;
			
			@Column(name="password")
			private String sellerPassword;
			
			@Column(name="mobile_no")
			private String mobileNumber;
			
			@Column(name="gender")
			private String sellerGender;
			
			@Column(name="gstin_no")
			private String sellerGstinNo;
			
			@Column(name="wallet_balance")
			private long sellerWalletBal;
			
			@Column(name="address")
			private String sellerAddress;

			//Constructor
			public Seller(long sellerId, String sellerName, String sellerEmail, String sellerPassword,
					String mobileNumber, String sellerGender, String sellerGstinNo, long sellerWalletBal,
					String sellerAddress) {
				super();
				this.sellerId = sellerId;
				this.sellerName = sellerName;
				this.sellerEmail = sellerEmail;
				this.sellerPassword = sellerPassword;
				this.mobileNumber = mobileNumber;
				this.sellerGender = sellerGender;
				this.sellerGstinNo = sellerGstinNo;
				this.sellerWalletBal = sellerWalletBal;
				this.sellerAddress = sellerAddress;
			}

			public Seller() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			//Getters and Setters
			public long getSellerId() {
				return sellerId;
			}
			public void setSellerId(long sellerId) {
				this.sellerId = sellerId;
			}
			public String getSellerName() {
				return sellerName;
			}
			public void setSellerName(String sellerName) {
				this.sellerName = sellerName;
			}
			public String getSellerEmail() {
				return sellerEmail;
			}
			public void setSellerEmail(String sellerEmail) {
				this.sellerEmail = sellerEmail;
			}
			public String getSellerpassword() {
				return sellerPassword;
			}
			public void setSellerpassword(String sellerPassword) {
				this.sellerPassword = sellerPassword;
			}
			public String getMobileNumber() {
				return mobileNumber;
			}
			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}
			public String getSellergender() {
				return sellerGender;
			}
			public void setSellergender(String sellerGender) {
				this.sellerGender = sellerGender;
			}
			public String getSellergstinNo() {
				return sellerGstinNo;
			}
			public void setSellergstinNo(String sellerGstinNo) {
				this.sellerGstinNo = sellerGstinNo;
			}
			public long getSellerWalletBal() {
				return sellerWalletBal;
			}
			public void setSellerWalletBal(long sellerWalletBal) {
				this.sellerWalletBal = sellerWalletBal;
			}
			public String getSelleraddress() {
				return sellerAddress;
			}
			public void setSelleraddress(String sellerAddress) {
				this.sellerAddress = sellerAddress;
			}
}
