package repls;

import java.util.*;

public class xxxxx {

	public static void main (String[] args){
	  
		  
		Map<String, Integer> map=new HashMap<String, Integer>();  
		map.put("Shiva",222);
		map.put("Sandish",333);
		map.put("Asel",555);
		map.put("Sumair",666);
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String entry=it.next();
			
			System.out.println(entry);
		}
		}
		}