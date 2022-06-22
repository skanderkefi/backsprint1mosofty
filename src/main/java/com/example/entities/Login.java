package com.example.entities;

public class Login {

private String mailAddress,mdp;
	
	

	public Login(String mailAddress, String mdp) {
		super();
		this.mailAddress = mailAddress;
		this.mdp = mdp;
	}

	public String getMailAdress() {
		return mailAddress;
	}

	public void mailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Login [mailAddress=" + mailAddress + ", mdp=" + mdp + "]";
	}
	
	
	
}
