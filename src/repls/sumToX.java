package repls;

public class sumToX {

 public	static int sumToX(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}
		return sum;
		
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(sumToX(5)); // 15
		System.out.println(sumToX(7)); // 28
	}
}
