package com.class18;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {

		ScannerMethod obj = new ScannerMethod();

		Scanner scan=new Scanner (System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		obj.sum(a, b);
		
		obj.sum(12, 13);
		obj.sum(100, 100);
		obj.sub();
	}

		public int sum(int a, int b) {
//		System.out.println(x + y);
		return a+b+100;
	}
		void sub () {
			int a=10, b=12;
			System.out.println(a+b);
		}
}
