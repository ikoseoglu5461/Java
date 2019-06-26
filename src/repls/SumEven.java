package repls;

public class SumEven {
	/*
	 * an integer Name: sumEvenToX Parameters: an integer called "x" Purpose:
	 * calculate the sum of the EVEN integers from 1 to x (including x)
	 * 
	 * Examples: sumEvenToX(5) ==> 6 sumEvenToX(8) ==> 20
	 * 
	 */
	public static int sumToX(int x) {

		int sumx=0;{
			
			for (int a=1; a<=x; a++) {
				sumx=sumx+a;{
				if (a%2==0); }
				}
				return sumx;
			}
		}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(sumToX(5)); // 6
		System.out.println(sumToX(8)); // 20
	}
}
