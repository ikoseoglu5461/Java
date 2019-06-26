package ExtraMapOverwiev;

public class Marketing {
	
	/* 1. Create a class called Marketing with fields of employeeName, productName,
    * and saleAmount. In your Test class have a collection of 10 marketing
    * employees and print those who achieved more than $3000 in sales.
    *
    */
	
	private String employeName; 
	private String productName;
	private int saleAmount;
	
	Marketing (String employeName, String productName, int saleAmount){
		super();
		this.employeName=employeName;
		this.productName=productName;
		this.saleAmount=saleAmount;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public int getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	public String toString () {
		return"Marketing [employeName="+employeName +", prudctName=" + productName +", saleAmount=" +saleAmount+"]";
	}
}
