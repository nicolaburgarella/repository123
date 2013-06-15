package org.koushik.javabrains.service;

import java.util.HashMap;

import org.koushik.javabrains.dto.User;

public class LoginService {
	
	HashMap <String, String> users = new HashMap<String, String>();
	
	public LoginService(){
		// in realtà dovrebbe interrogare il database, questo è un semplice esempio
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("jguru", "Java Guru");
		
	}
	
	public boolean authenticate(String userID, String password){
		
		if(userID == null || password.trim()==""){
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userID){
		
		User user = new User();
		user.setUserName(users.get(userID));
		user.setUserID(userID);
		
		return user;
	}

}
