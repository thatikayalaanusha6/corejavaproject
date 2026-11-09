package com.OopAbstraction;

public class AttendanceDriver {

	public static void main(String[] args) {
		Developer d = new Developer();
		Tester t = new Tester();
		Manager m = new Manager();
d.MarkAttendance();
t.MarkAttendance();
m.MarkAttendance();
	}

}
