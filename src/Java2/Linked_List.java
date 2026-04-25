package Java2;

import java.util.LinkedList;

public class Linked_List {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<>();
	l.add(1);
	l.add(2);
	l.add(2);
	l.remove(2);
	System.out.println(l);
}
}
