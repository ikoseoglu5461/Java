package com.class34;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class SecondMethodTask1 {

		public static void main(String[] args) {
			
			String[] cityArray= {"London", "Moscov", "Baku", "Berlin", "Istanbul", "Islamabad"};
			
			Map<String, Integer> cityMap=new TreeMap<>();
			
			for (String city:cityArray) {
				cityMap.put(city, city.length());
			}
			System.out.println(cityMap);
			
			Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
			while(it.hasNext()) {
				//1. way
//				Map.Entry<String, Integer> entry=it.next();
//				if(entry.getValue()>7) {
//					it.remove();
//				}
				//2. way
				String key=it.next().getKey();
				if(key.length()>7) {
					it.remove();
				}
			}
			System.out.println(cityMap);
		}
		
	}

