package makingStatements;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(10));
	}
	
	public static int fibonacci(int num) {
		
		int[] sequence = new int[num + 2];
		
		sequence[0] = 0;
		sequence[1] = 1;
		
		for(int i = 2; i <= num; i++) {
			sequence[i] = sequence[i - 1] + sequence[i - 2];
		}
		
		return sequence[num];
		
		
	}

}
