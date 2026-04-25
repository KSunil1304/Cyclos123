package ExceptionHandlings;

public class Program1 {
	public static void main(String[] args) {

		System.out.println("Program execution starts");
		int fNumber = 9;
		int sNumber = 04;
		int result = 0;

		
		try {
			result =fNumber/sNumber;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("finally block");
		}

		System.out.println("output is: "+result);
		System.out.println("program execution end");
	}
}
