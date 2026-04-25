package Java;

import java.util.Scanner;

public class HowManyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter a number");
		 * int num = sc.nextInt();
		 */
		int num =12345;
	int count = 0;
	while(num>0) {
		num = num/10;
		count++;
	}
		System.out.println("entered number digits are:"+count);
	}

	}
