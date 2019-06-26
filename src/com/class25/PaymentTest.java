package com.class25;

public class PaymentTest {
	public static void main(String[] args) {
		
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa vs=new Visa();
		vs.makePayment();
		vs.annualFee();
		
		// achieving run time polymorphism
		// pay- reference variable, payment -type
		//new MasterCard (); - creating an object
		Payment pay=new Payment();
		// any method that that exist in parent and common in child
		pay.closePayment();
		pay.makePayment();
		
		Payment pay1=new Visa();
		pay1.closePayment();
		pay1.makePayment();
		//pay1.annualFee(); There is no annual fee method in the Payment class
		
	}
}
