package Java;

public class Relationship_reverse {
	public static void main(String[] args) {

		String str = "Relationship";
		String[] x = str.split("");
		for(int i=str.length()-1; i>=0; --i) {
			System.out.print(x[i]);
		}
	}
}
