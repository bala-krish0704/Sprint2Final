package com.cg.onlinebookstoremanagementsysapp.entity;
import javax.persistence.*;

import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@Entity
@Table(name="Reader")
public class Reader {

	//Entity Attributes and Column Names
	@Id
	@Column(name="reader_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long readerId;
	
	@Column(name="name")
	private String readerName;
	
	@Column(name="email")
	private String readerEmail;
	
	@Column(name="password")
	private String readerPassword;
	
	@Column(name="mobile_no")
	private String readerMobileNo;
	
	//Constructor

	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reader(int readerId, String readerName, String readerEmail, String readerPassword, String readerMobileNo
			) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.readerEmail = readerEmail;
		this.readerPassword = readerPassword;
		this.readerMobileNo = readerMobileNo;

	}

	//Getters and Setters
	
	public long getReaderId() {
		return readerId;
	}

	public void setReaderId(long readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getReaderEmail() {
		return readerEmail;
	}

	public void setReaderEmail(String readerEmail) {
		this.readerEmail = readerEmail;
	}

	public String getReaderPassword() {
		return readerPassword;
	}

	public void setReaderPassword(String readerPassword) {
		this.readerPassword = readerPassword;
	}

	public String getReaderMobileNo() {
		return readerMobileNo;
	}

	public void setReaderMobileNo(String readerMobileNo) {
		this.readerMobileNo = readerMobileNo;
	}


}
	