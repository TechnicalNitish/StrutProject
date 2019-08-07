package com.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.struts2.Dao.UserDaoimpl;
import com.struts2.pojo.User;

@Namespace("/")
@Action(value = "forget",results = {@Result(name = "reset",location = "/reset.jsp")})
public class Forget {

	private String email;

	public String execute() {
		User user = new User();
		user.setEmail(email);
		UserDaoimpl userdaoimpl = new UserDaoimpl();
		if (userdaoimpl.forget(email)) {
			return "reset";
		} else {
			return "invalid Email";
		}
	}

	public Forget() {
	}

	public Forget(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Forget [email=" + email + "]";
	}

}
