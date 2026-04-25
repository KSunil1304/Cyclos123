package Java2;

import java.util.HashMap;

public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(1, "Sunil");
	hm.put(2, "Jay");
	hm.put(3, "Kommayella");
	hm.put(4, "sunil");
	hm.remove(1);
	System.out.println(hm);
}
}
