
public class RecursionFactorial {
	public static long factorial(long n) {
		if (n<=1) 
			return 1;
		
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		long num =100;
		System.out.println("Factorial of "+ num + " is " + factorial(num));
	}
}
