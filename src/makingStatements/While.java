package makingStatements;

public class While {
	public static void main(String[] args) {
		int num = 100;
		
		while(num > 0) {
			System.out.println("While Countdown: " + num);
			num -= 10;
		}
		
		do {
			System.out.println("Do While Countup: " + num);
			num += 10;
		} while(num < 10);
	}

}
