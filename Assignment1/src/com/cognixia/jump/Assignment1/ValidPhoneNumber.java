package com.cognixia.jump.Assignment1;

public class ValidPhoneNumber {

	public static void main(String[] args) {
		
		String phoneNumber1 = "870-924-9111";
		String phoneNumber2 = "8793458911";
		String phoneNumber3 = "987-564-0987";
		
		validateNumber(phoneNumber1);
		validateNumber(phoneNumber2);
		validateNumber(phoneNumber3);
	}
	
	public static void validateNumber(String phoneNumber) {
		
	
		if(phoneNumber.contains("911")) {
			System.out.println("Not a valid Phone Number: " + phoneNumber + " b/c it contains 911 in a Sequence");
			
		}
		else {
			System.out.println("Valid Phone Number!: " + phoneNumber);
		}
		
		
		
	}
}
