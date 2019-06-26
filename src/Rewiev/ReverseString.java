package Rewiev;

public class ReverseString {
	
	String str = "seigolonhceT xatnyS";
	
	public static void main(String[] args) {

		ReverseString str = new ReverseString();
		str.reverseString();
	}

	void reverseString() {
		
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			System.out.println(reverse);
		}

	}
}