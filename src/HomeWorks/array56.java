package HomeWorks;

import java.util.Scanner;

public class array56 {

	public static void main(String[] args) {

		String[] weekdays = new String[7];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < weekdays.length; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");
			weekdays[i] = scan.nextLine();
		}

		for (int j = 0; j < weekdays.length; j++) {
			System.out.println(weekdays[j]);
		}

	}
}
