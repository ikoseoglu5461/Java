package com.class25;

public class SyntaxStudent extends Student {
	public void study () {
		System.out.println("Syntax students must study HARD");
	}
	protected void doHomeWork() {
		System.out.println("Syntax students must do REPL");
	}
	void attendClasses() {
		System.out.println("Syntax student must attend class");
	}
	//creating child specific private method doReserch
	private void doReserch() {
		System.out.println("Syntax students must make reserch from Google");
	}

}
