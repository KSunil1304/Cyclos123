package Java;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {

	Scanner myscan=new Scanner(System.in);
    System.out.println("enter a number");
    int x=myscan.nextInt();
    int sum=0;
    int temp=x;
    while(x>0) {
    	int r=x%10;
    	sum=(sum*10)+r;
    	x=x/10;
    }
    if(temp==sum) {
    	System.out.println("polindrome number");
    	
     }
    else {
    	System.out.println("not polindrome number");
    }
}
}

