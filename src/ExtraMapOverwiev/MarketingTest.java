package ExtraMapOverwiev;

import java.util.HashMap;
import java.util.Map;

public class MarketingTest {

	public static void main(String[] args) {
		
		Map<String, Marketing> sales = new HashMap<String, Marketing>();

		sales.put("Alex", new Marketing("Alex", "Shoes", 3000));
		sales.put("Ali", new Marketing("Ali", "Shoes", 4000));
		sales.put("Smith", new Marketing("Smith", "Shoes", 5000));
		sales.put("Adam", new Marketing("Adam", "Shoes", 2000));
		sales.put("Tiffany", new Marketing("Tiffany", "Shoes", 6000));
		sales.put("Aloha", new Marketing("Aloha", "Shoes", 1000));
		sales.put("Sam", new Marketing("Sam", "Shoes", 10000));
		sales.put("Mustafa", new Marketing("Mustafa", "Shoes", 15000));
		
		for (String key:sales.keySet()) {
			Marketing m=sales.get(key);
			if(m.getSaleAmount()>3000) {
				System.out.println(m.toString());
			}
		}
	}

}
