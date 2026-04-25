package Java;

public class Reverse_Stars {
public static void main(String[] args) {
	for(int i=1;i<=5; i++) {
		for(int j=5; j>=i; j--) {
			System.out.print(j+" "); 
			//remove j and put stars like "* "
		}
		System.out.println();
	}
}
}
