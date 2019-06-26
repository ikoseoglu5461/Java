package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {

	public static void main(String[] args) {
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary1=90000; // can access protected values from different package through inheritance only
		//wt.salary; //default values can not be acces on different package
		
		wt.test(); // available cause it is protected
		//wt.test1(); //is not available cause it is default
	}

}
