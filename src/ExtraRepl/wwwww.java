package ExtraRepl;

import java.util.*;

public class wwwww {

	public static void main(String[] args) {
		
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator it = map.iterator();
		while (it.hasNext() ) 
		{
		System.out.print( it.next() + " " );
		}

}
}