package com.obsqura.revision.inheritance;

public class Family {
String a,b,c,d;

public Family(String a, String b, String c, String d) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
}
public void display() {
	System.out.println("Father 's name : " +a);
	System.out.println("Mother 's name : " +b);
	System.out.println("brother 's name : " +c);
	System.out.println("Mother 's name : " +c);
	
}
}
