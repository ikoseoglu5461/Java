package com.class26;

public class BankTest {

	public static void main(String[] args) {
		
		
		Bank bankA=new BankA();
		System.out.println("Bank A:"+bankA.getBalance()+"$");

		Bank bankB=new BankB();
		System.out.println("Bank B:"+bankB.getBalance()+"$");
		
		Bank bankC=new BankC();
		System.out.println("Bank C:"+bankC.getBalance()+"$");
	}
}
