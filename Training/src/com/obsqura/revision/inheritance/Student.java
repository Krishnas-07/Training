package com.obsqura.revision.inheritance;

public abstract class Student {
String name;
public abstract void studentname();
public void rollnumber() {
	System.out.println("Rollnumber is 29");
}
public Student(String name) {
	super();
	this.name = name;
}
}
