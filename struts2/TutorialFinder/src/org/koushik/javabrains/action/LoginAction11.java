package org.koushik.javabrains.action;

import com.opensymphony.xwork2.Action;
// http://www.opensymphony.com/webwork/api/com/opensymphony/xwork/Action.html
public class LoginAction11 implements Action {
	
	private String userId;
	private String password;
	
	private static String SUCCESS = "success";
	
	public String execute(){
		
		if(getUserId().equals("userId") && getPassword().equals("password")){
			 return SUCCESS;
		}
		return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}


