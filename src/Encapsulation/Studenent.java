package Encapsulation;

public class Studenent {
private	int rollnumber;
private	String name;
public int getRollnumber() {
	return rollnumber;
}

public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

private	boolean isAttended;

	public Studenent(int rollnumber) {
		//this is the constructor method
		this.rollnumber = rollnumber;
	}

	public void setStudentAttendence(boolean flag) {
		if(!isAttended)
		isAttended = flag;
		System.out.println("teacher assigned attendence");
	}

	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}
}
