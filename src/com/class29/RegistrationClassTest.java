package com.class29;

public class RegistrationClassTest {
	public static void main(String[] args) {
		
		RegistrationClass obj=new RegistrationClass();
		
		obj.setEmail("mehmetozcan@outlook.com");
		obj.setUserName("mehmetoz");
		obj.setPassword("mehmet54545");
		
		
		System.out.println(obj.getEmail());
		System.out.println(obj.getPassword());
		System.out.println(obj.getUserName());
	}

}
