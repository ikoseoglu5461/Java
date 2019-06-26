package repls;

public class Main2 {

	void display(int batch, String InstituteName, int year) {
		System.out.println(batch);
		System.out.println(InstituteName);
		System.out.println(year);
	}

	public static void main(String[] args) {
		Main2 mm = new Main2();
		mm.display(3, "SyntaxSolutions", 2019);

	}
}