package tasks;

abstract public class Parent {
	
	 abstract void method1();
	  public void method2(){
	    System.out.println("abstract method2 implementation in parent class");
	  }
	}

	class Main extends Parent {
	  void method1(){
	    System.out.println("abstract method1 implementation in main class");
	  }
	  public static void main(String[] args) {
	    
	    Parent obj=new Parent();
	    obj.method1();
	    obj.method2();
	    
	  }
	}