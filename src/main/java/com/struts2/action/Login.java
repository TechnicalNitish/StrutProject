package com.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.Dao.UserDaoimpl;
import com.struts2.pojo.User;

@Namespace("/")
@Action(value = "login", results = { @Result(name = "welcome", location = "/welcome.jsp") })
public class Login extends ActionSupport{
	
	private String email;
	private String password;
	
	public String execute()
	{
		User user =new User();
				user.setEmail(email);
				user.setPassword(password);
				
		UserDaoimpl userDaoimpl=new UserDaoimpl();
		if(userDaoimpl.login(email, password))
		{
			return "welcome";
		}
		else {
			return "Invalid user";
		}
	}
	
	
	public Login() {
		
	}
	public Login(String email, String password) {
		
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
	
	

}
