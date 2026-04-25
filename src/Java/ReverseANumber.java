package Java;

public class ReverseANumber {
public static void main(String[] args) {
	int a = 12345;
	int reverse = 0;
	while(a>0) {
		int r = a%10;
		reverse = reverse*10+r;
		a=a/10;
	}
	System.out.println(reverse);
}
}
