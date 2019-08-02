package com.struts2.Dao;

import com.struts2.pojo.User;

public interface UserDao {
	void register(User user);
	boolean login(String email,String password);
	public boolean forget(String email);
}
