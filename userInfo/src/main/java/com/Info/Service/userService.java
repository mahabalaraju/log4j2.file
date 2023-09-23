package com.Info.Service;

import java.util.List;

import com.Info.entity.user;

public interface userService {

	public List<user> getallusers();
	
	public String delete(int id);
	
	public user getbyid(int id);
	
	public String upsert(user user);
}
