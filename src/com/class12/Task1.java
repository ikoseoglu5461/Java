package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* Accept username, password and confirm password and check following requirements:
		Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=”Password is too short”.
		Password cannot contain username if so, → message=”Password cannot contain username”.
		Password should match confirmed password, if not  → message “Passwords do not match”.
		Only after all requirements met → message “Your username and password has been created”
		 */
		String userName, password, confirmPassword = null;
		
		do {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter username:");
		userName=scan.nextLine();
		System.out.println("Please enter password:");
		password=scan.nextLine();
		
		
		boolean isEmpty;
		
		if (!(userName.isEmpty() || password.isEmpty())) {
			
			if (password.length()>=8) {
				
				if (!(password.contains(userName))) {
					
						System.out.println("Please confirm password:");
					confirmPassword=scan.nextLine();
					
					if (password.equals(confirmPassword)){
						
                        System.out.println("Your username and password has been created");
						break;
					}else {
						System.out.println("Pasword do not match");}
					
					}else {
					
						System.out.println("Password can not contain username");}
					}else {
					
						System.out.println("Password is to short");}
					
					}else {
					
						System.out.println("Username and Password can not be empty");
				}
		}while (confirmPassword!=password);
	}
	}
