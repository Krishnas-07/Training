package com.obsqura.revision.inheritance;

public class Home {
	int age1,age2,age3,age4;
	
	
public Home(int age1, int age2, int age3, int age4) {
	super();
	this.age1 = age1;
	this.age2 = age2;
	this.age3 = age3;
	this.age4 = age4;
}
public void display() {
	System.out.println("Age is "+age1);
	System.out.println("Age is "+age2);
	System.out.println("Age is "+age3);
	System.out.println("Age is "+age4);
	
}
	
public static void main(String[] args) {
	Family a=new Family("Father","Mother","Brother", "Sister");
	a.display();// TODO Auto-generated method stub
Home b=new Home(60,55,29,26);
b.display();
}}
