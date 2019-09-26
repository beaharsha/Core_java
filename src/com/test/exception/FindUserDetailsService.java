package com.test.exception;

public class FindUserDetailsService {

	public void findUser(String userName) throws UserNotFoundException  {
		
		if(userName.equals("sachin")) {
			System.out.println("user found");
		}
		else {
			throw new UserNotFoundException("user not found try with diff username");
		}
	}
}
