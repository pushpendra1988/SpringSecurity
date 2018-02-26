package com.pusp.security.service;

import com.pusp.security.dao.UserDaoImpl;
import com.pusp.security.dto.User;

public class UserServiceImpl implements UserService {

	private UserDaoImpl userDaoImpl;
	
	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	
	@Override
	public String generateLoginDetails(User user) {
		String response = null;
		int count = userDaoImpl.insertUser(user);
		if(count > 0) {
			response = "User Created SuccessFully.";
		}
		else {
			response = "Unable To Create the User.";
		}
		return response;
	}

}
