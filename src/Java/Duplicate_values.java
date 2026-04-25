package Java;

public class Duplicate_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Jay Sudheer";
		//int count = 0;
		char[] ch = s1.toCharArray();
		for(int i =0; i<ch.length; i++) {
			for(int j =i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate values are:"+ch[j]);
				}	
			}
		}
	}
}