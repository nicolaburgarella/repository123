package org.koushik.javabrains.service;

import org.koushik.javabrains.model.User;

//login service da utilizzare nella login action 
public class LoginService {
	
	public boolean verifyLogin(User user){
		
		if(user.getUserId().equals("userId") && user.getPassword().equals("password")){
			return true;
		}
		return false;
	}
}
