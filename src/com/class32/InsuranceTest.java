package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	public static void main(String[] args) {
		
		Insurance obj1=new CarInsurance ("Geico", "Toyota");
		Insurance obj2=new PetInsurance ("Prograssive", "Dog");
		Insurance obj3=new HealthInsurance ("Kaiser");
		
		ArrayList<Insurance> insList=new ArrayList<Insurance>();
		insList.add(obj1);
		insList.add(obj2);
		insList.add(obj3);
		
		//For loop
		for (int i=0; i<insList.size(); i++) {
			System.out.println(insList.get(i).insuranceName);
		}
		//Advance Loop
		
		for (Insurance ins:insList) {
			ins.getQuote();
		}
		//Iterator
		Iterator<Insurance> it=insList.iterator();
		while(it.hasNext()) {
			it.next().cancelInsurance();
			
		}
	}

}
