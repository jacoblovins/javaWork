package makingStatements;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		System.out.println("What is your name?");
	
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);

	}

} 
