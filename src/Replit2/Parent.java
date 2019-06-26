package Replit2;

public class Parent {
	
		   static void m1(){
		    System.out.println("m1 static method in parent class");
		  }
		}
		class Child extends Parent{
		  static void m1(){
		  System.out.println("m1 static method in child class");
		  }
		  void m2(){
		    this.m2();
		    super.m1();
		  }
		}
		class Main {
		  public static void main(String[] args) {
		    
		    Child obj=new Child();
		    obj.m2();
		  }
		}
