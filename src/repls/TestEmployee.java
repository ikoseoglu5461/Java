package repls;

public class TestEmployee {
	public static void main(String[] args){
		  
		  Employee s1=new Employee();
		  Employee s2=new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		  System.out.println(s1.name+" "+s1.lastName+" "+s1.employeeId+" "+s1.startDate+" "+s1.salary);
		  System.out.println(s2.name+" "+s2.lastName+" "+s2.employeeId+" "+s2.startDate+" "+s2.salary);
		
		}
	}


