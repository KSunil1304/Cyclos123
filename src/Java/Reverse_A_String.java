package Java;

public class Reverse_A_String {
public static void main(String[] args) {
	
	String s = "Relationship";
	String[] a = s.split("");
	for(int i=a.length-1; i>=0; i--) {
		System.out.print(a[i]);
	}
}
}
