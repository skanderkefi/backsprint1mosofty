package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	private Integer id;
	private String mailAddress;
	private String password;
	
	public User(Integer id, String mailAddress, String password) {
		super();
		this.id = id;
		this.mailAddress = mailAddress;
		this.password = password;
	}
	
	public User( String mailAddress, String password) {
		super();
		this.mailAddress = mailAddress;
		this.password = password;
	}
	
	
	public User() {
		super();
	}

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="mail_address")
	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", mailAddress=" + mailAddress + ", password=" + password + "]";
	}
	
	
	
	
	

}
