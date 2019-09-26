package com.test.exception;

public class UserDetailsController {

	public static void main(String[] args) {
		 FindUserDetailsService detailsService;
		detailsService = new FindUserDetailsService();

		try {
			detailsService.findUser("zahir");
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("successfully terminated");
	}
}
