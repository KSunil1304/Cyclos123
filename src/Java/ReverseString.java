package Java;

public class ReverseString {
public static void main(String[] args) {
	
	String s = "Sunil";
	String [] a= s.split("");
	for(int i =a.length-1; i>=0; i--) {
		System.out.println(a[i]);
	}
}
}

