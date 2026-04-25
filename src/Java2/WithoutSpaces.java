package Java2;

public class WithoutSpaces {
public static void main(String[] args) {
	String str = " J a y S u d h e e r ";
	
	//Using replaceAll() Method

	String str1 = str.replaceAll("\\s", "");
	System.out.println(str1);
}
}
