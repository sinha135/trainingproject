package com.visa.training.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credentials {
	
	@Id
	private int eid;
	private String password;
	private String discriminator;

	public int getEid() {
		return eid;
	}

	public void setEid(int userId) {
		this.eid = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

}
