package ExtraRepl;

public abstract class Parent {
	 Parent (){
		    System.out.println("abstract class Constructor");
		  }
		}


		class Main extends Parent{

		  void Parent(){
		     System.out.println("Main class Constructor");
		  }
		  public static void main(String[] args) {
		 
		    Parent obj=new Main();
		    Main obj1=new Main();
		    
		  }
		}