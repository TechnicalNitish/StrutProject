package com.struts2.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.Dao.UserDaoimpl;
import com.struts2.pojo.User;

@Namespace("/")
@Action(value = "register", results = { @Result(name = "success", location = "/successful.jsp") })
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String email;
	private String contacts;
	private String password;
	
	public String execute()
	{
		User user=new User(name,email,contacts,password,id);
		UserDaoimpl userDaoImpl=new UserDaoimpl();
		userDaoImpl.register(user);
		return "success";
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

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterAction [id=" + id + ", name=" + name + ", email=" + email + ", contacts=" + contacts
				+ ", password=" + password + "]";
	}
	

	

}
