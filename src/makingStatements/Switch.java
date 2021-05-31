package makingStatements;

public class Switch {

	public static void main(String[] args) {
		int month = 4, year = 2022, num = 31;
		
		switch(month) {
		case 1: System.out.println("one"); break;
		case 2: System.out.println("two"); break;
		case 3: System.out.println("three"); break;
		case 4: System.out.println("four"); break;
		default: System.out.println("More than four");
		
		}
		
		switch(month) {
		case 4: case 6: case 9: case 11: num = 30; break;
		case 2: num = (year % 4 == 0)? 29 : 28; break;
		}
		
		System.out.println(month + "/" + year + ": " + num + " days");

	}

}
