package com.class34;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, Person> person=new HashMap<>();
		person.put(1, new Person("Ali", "Ak", 32, 67000));
		person.put(2, new Person("Ismail", "Koseoglu", 30, 90000));
		person.put(3, new Person("Mehmet", "Pak", 28, 80000));

		
		Collection <Person> personValues=person.values();
		for(Person per:personValues) {
			per.printPersonDetails();
		}
		
	}

}

