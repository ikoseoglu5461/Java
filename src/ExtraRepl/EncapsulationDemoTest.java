package ExtraRepl;

public class EncapsulationDemoTest {
	
	
 /* 7560504000 Sumair sumair@syntaxsolutions.com 500000.0
  * 
  */
	
	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setAcc_no(7560504000l);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000.0f);
		System.out.print(obj.getAcc_no()+" ");
		System.out.print(obj.getName()+" ");
		System.out.print(obj.getEmail()+" ");
		System.out.print(obj.getAmount()+" ");
		
	}
}
