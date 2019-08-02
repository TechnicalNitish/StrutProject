package com.struts2.pojo;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id 
	private int id;
	private String name;
	private String email;
	private String contacts;
	private String password;

	public User() {
	}

	public User(String name, String email, String contactS, String password,int id) {
		
		this.id=id;
		this.name = name;
		this.email = email;
		this.contacts = contactS;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contactS) {
		this.contacts = contactS;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contactS=" + contacts + ", password="
				+ password + "]";
	}

}
