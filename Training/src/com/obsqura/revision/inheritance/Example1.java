package com.obsqura.revision.inheritance;

public class Example1 extends Example {

	public void display(int a,int b)
	{
		int sub=a-b;
		System.out.println("The difference is "+sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example1 obj1=new Example1();
obj1.display(10, 5);
	}

}
