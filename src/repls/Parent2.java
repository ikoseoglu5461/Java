package repls;

public class Parent2 {
	 
	   void main (){
	     System.out.println("m1 method in parent class");
	   }
	 }

	 class Child2 extends Parent{
	   void main (){
	     System.out.println("m1 method in child class");
	   }
	   void main2 (){
	     System.out.println("m1 method in child class");
	   }
	 }
	 
	 class Main {
	  public static void main(String[] args) {
	  
	  Child2 obj=new Child2();
	  this.main();
	  super.main();

	}
	}
