package tasks;

public class Quizz {

	public static void main(String[] args) {

		
for (int num1 = 0; num1 < 24; num1++) {
            
            for (int num2 = 0; num2 < 60; num2++) {
                if (num1 < 10) {
                    System.out.println("0"+num1 + ":" + num2);
            }else if(num2 < 10) {
                    System.out.println(num1 + ":0" + num2);
                } else {

                    System.out.println(num1 + ":" + num2);
                }
            }
        } 
}
}