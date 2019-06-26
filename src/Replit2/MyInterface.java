package Replit2;

public class MyInterface {

	int a = 100;
	final int b = 200;
	static int c = 300;

}
class Main implements MyInterface {

	public static void main(String[] args) {
		
		Main obj=new Main();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
