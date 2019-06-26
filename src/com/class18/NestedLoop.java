package com.class18;

public class NestedLoop {

	public static void main(String[] args) {

		NestedLoop demo = new NestedLoop();
		demo.printPattern();
	}

	void printPattern() {
		for (int i = 1; i <= 7; i++) {
			for (int y = 1; y <= 7; y++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}