package Replit2;

public interface MyInterface1 {
	public void method1();

}

interface MyInterface2 extends MyInterface1 {

	public void method2();
}

class Main implements MyInterface2 {

	public void method1() {
		System.out.println("welcome to syntax solutions");
	}

	public void method2() {
		System.out.println("hi syntax solutions how are you");
	}

	public static void main(String[] args) {

		MyInterface2 obj = new Main();
		obj.method1();
		obj.method2();
	}

}
