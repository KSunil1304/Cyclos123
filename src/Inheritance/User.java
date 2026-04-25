package Inheritance;

public class User {
public static void main(String[] args) {
	Guest g =new Guest();
	g.read();
	
	Developer dev = new Developer();
	dev.write();
	
	Admin ad = new Admin();
	ad.manage();
	
}
}
