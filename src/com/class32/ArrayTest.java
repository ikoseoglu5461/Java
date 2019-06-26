package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		
		String a="A";
		String b=new String("B");
		
		int[] intArray= {10, 21, 30};
		String [] strArray= {"Hello", "Bye"};
		
		//Can we place Object into Array?
		
		Visa visa1=new Visa("Visa Paltinum");
		Visa visa2=new Visa("Visa Paltinum");
		Visa visa3=new Visa("Visa Paltinum");
		
		AX ax1=new AX("AX Paltinum");
		AX ax2=new AX("AX Paltinum");
		AX ax3=new AX("AX Paltinum");
		
		CreditCard[] visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};
		//array of Objects
		Object[] objectArray= {visa1, ax1, "John", 67, true, 90.08};
	}

}
