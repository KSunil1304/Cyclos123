package Java2;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12345);
		al.add("Sunil");
		al.add("Sunil");
		//IN ARRAYLIST DUPLICATE ELEMENTS ARE ACCEPTED
		
		al.add('S');
		al.add(12.34);
		System.out.println(al);
		System.out.println(al.get(3));
		//IT WILL GET THE VALUE IN THE INDEX NO.2 
		//INDEX ALWAYS STARTS WITH 0
		int suni = al.size();
		System.out.println(suni);
		//NOW BY USING FOR LOOP
		for(int i=0; i<suni; i++) {
			System.out.println("Values from suni "+ al.get(i));
		}
		
	}

}
//LIST:- IS AN INTERFACE
//INTERFACE:-BLUEPRINT OF A CLASS.IT CONTAINS STATIC CONSTANTS AND ABSTRACT METHODS\
//STATIC CONSTANTS:- STATIC VARIABLES ARE RARELY USED OTHER THAN BEING DECLARED AS CONSTANTS.
//ABSTRACT METHODS:-A METHOD IS DECLARED USING THE ABSTRACT KEYWORD WITHIN AN ABSTRACT CLASS AND DOESN'T HAVE ANY DEFINITION (IMPLEMENTATION)
//ARRAYLIST:- IS A CLASS AND IMPLEMENTS LIST.
//ARRAYLIST IS A CLASS USES A DYNAMIC ARRAY FOR STORING THE VALUES
//JAVA ARRAYLIST CLASS CAN CONTAINS DUPLICATE ELEMENTS
//JAVA ARRAYLIST CLASS MAINTAINS INSERTION ORDER

