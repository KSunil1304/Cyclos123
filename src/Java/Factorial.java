package Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter  a  number");
		 * int num = sc.nextInt();
		 */
		int num=3;
		int i =1;
		int fact=1;  
		
		for(i=1;i<=num;i++){    
			fact=fact*i;    
		}
		System.out.println(fact);
	}  

}


