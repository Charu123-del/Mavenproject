package com.sdet;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String uname,String pwd) {
		
		ResourceBundle rb =ResourceBundle.getBundle("config");
		String name=rb.getString("username");
		
		String pw=rb.getString("password");
		
		if(uname.equals(name) && (pwd.equals(pw))){
			return 1;
		}
		else {
			return 0;
		}
	}

}
