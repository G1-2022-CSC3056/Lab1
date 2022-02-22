package tests;

import models.User;

public class UserTests {

	public static void main(String[] args) {
		// Instantiate user
		String testUsername = "esteemedhost101";
		String testPassword = "creepercon";
		String testFirstName = "Michael";
		String testLastName = "Wilcox";
		String testMobileNumber = "idonthaveaphone";
		
		User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);
		
		Boolean passed = true;
		
		if (testUsername != testUser.getUsername()) {
			System.out.println("ERROR! Username doesn't match. Test failed");
			passed = false;
		}
		
		if (testPassword != testUser.getPassword()) {
			System.out.println("ERROR! Password doesn't match. Test failed");
			passed = false;
		}
		
		// automated test for first name
		if (testFirstName != testUser.getFirstName()) {
			System.out.println("ERROR! First name doesn't match. Test failed");
			passed = false;
		}
		
		// automated test for last name
		if (testLastName != testUser.getLastName()) {
			System.out.println("ERROR! Last name doesn't match. Test failed");
			passed = false;
		}
		
		// automated test for mobile number
		if (testMobileNumber != testUser.getMobileNumber()) {
			System.out.println("ERROR! Mobile number doesn't match. Test failed");
			passed = false;
		}
		
		if (passed) {
			System.out.println("All tests ran OK.\n\n");
		}
		
		/*
		 * Assertions
		 */
		
		assert testUser.getUsername() == testUsername;
		assert testUser.getPassword() == testPassword;
		assert testUser.getFirstName() == testFirstName;
		assert testUser.getLastName() == testLastName;
		assert testUser.getMobileNumber() == testMobileNumber;
		// assert 1 == 2;
		
		
		
		System.out.println(testUser.toString());
	}

}
