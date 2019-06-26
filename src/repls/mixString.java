package repls;

public class mixString {
		  public static String mixString(String s1, String s2){
				
			  int s1Leng=s1.length();
				int s2Leng=s2.length();
				int max = Math.max(s1Leng, s2Leng);
				String word = "";
				for (int i = 0; i < max; i++) {
					
					    if (i <= s1Leng-1)
					
					      word += s1.substring(i,i+1);
					
					    if (i <= s2Leng-1)
					
					      word += s2.substring(i,i+1);

				}
				return word;
			}
						
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
				System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
			}
		}


