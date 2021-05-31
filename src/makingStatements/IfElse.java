package makingStatements;

public class IfElse {

	public static void main(String[] args) {
		if(5 > 1) System.out.println("Five is greater than one");
		
		if(2 < 4) {
			System.out.println("Two is less than four");
			System.out.println("Test Succeeded");
		}
		
		int num = 20;
		
		if(((num > 5) && (num < 10)) || (num == 12)) {
			System.out.println("Number is 6-9 inclusive or 12");
		}
		
		int hours = 19;
		
		if(hours < 13) {
			System.out.println("Good Morning: " + hours);
		} else if(hours < 18) {
			System.out.println("Good Afternoon: " + hours);
		} else {
			System.out.println("Good Evening: " + hours);
		}
		
		

	}

}
