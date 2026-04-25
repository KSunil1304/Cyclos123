package Java;

import java.util.Scanner;

public class Area_Of_A_Circle {
public static void main(String[] args) {
	
	int radius;
	double pie = 3.14, area;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the radius of  a circle");
	radius = sc.nextInt();
	area = pie*radius*radius;
	System.out.println(area);
}
}
