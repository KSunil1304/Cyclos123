package Java;
import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter any two number");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After swapping:");
		System.out.println(num1);
		System.out.println(num2);
	}
}
