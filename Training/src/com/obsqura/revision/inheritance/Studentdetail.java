package com.obsqura.revision.inheritance;

public class Studentdetail extends Student {

	public Studentdetail(String name) {
		super(name);
		System.out.println("name is "+name);// TODO Auto-generated constructor stub
	}

	@Override
	public void studentname() {
		System.out.println("Student name is Krishna");// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Student s=new Studentdetail("krishna");
		s.studentname();
        s.rollnumber();
	}

}
