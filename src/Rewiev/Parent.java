package Rewiev;

abstract class Parent{
	  abstract void m1();
	  abstract void m2();
	}

	class Main extends Parent {
	  void m1(){
	    System.out.println("abstract method1 implementation in main class");
	  }
	   void m2(){
	    System.out.println("abstract method2 implementation in main class");
	  }
	  
	  public static void main(String[] args) {
	   
	   Parent mm=new Main();
	   mm.m1();
	   mm.m2();
	   
	  }
	}
	/*Create abstract class as  parent 
	 *Create two abstract methods  
	 *Extends the abstract class with main class and provide the implementation for abstract methods which are declared in the parent class
	 *In main method by creating the object on main class with parent class instance and call those two methods in the main method 
	 * 
	 */
	