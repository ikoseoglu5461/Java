package repls;

class Parent {
	
	int a=10, b=20;
}

class Child1 extends Parent { 
	int a=30;
	int b=40;

void m1(int a,int b) { //local variables
	
	System.out.println(a+b); //local variables addition
	System.out.println(this.a+this.b); //current class variables addition
	System.out.println(super.a+super.b); //super class variables addition
	}
	}

class Main2 {
	  public static void main(String[] args) {
	    Child1 cc= new Child1();
	    cc.m1(50,60);
	  }
	}
