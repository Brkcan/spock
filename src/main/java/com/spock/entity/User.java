package com.spock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tblusers")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotNull
	@Column(name = "username")
	private String username;
	
	@NotNull
	@Column(name = "displayname")
	private String displayName;
	
	
	@Column(name = "password")
	private String password;

	@Column(name = "depotcode")
	private int depotcode;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getDepotcode() {
		return "depotcode";
	}


	public void setDepotcode(int depotcode) {
		this.depotcode = depotcode;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", displayName=" + displayName + ", password=" + password
				+ ", depotcode=" + depotcode + "]";
	}

	
	
}
