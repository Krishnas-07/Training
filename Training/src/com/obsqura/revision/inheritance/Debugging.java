package com.obsqura.revision.inheritance;

public class Debugging {
int a=110, b=85;
public void add() {
	int sum=a+b;
	System.out.println("Sum is "+sum);
}public void sub() {
	int sub=a-b;
	System.out.println("Difference is "+sub);
}

	public static void main(String[] args) {
		Debugging a=new Debugging();
		a.add();
		a.sub();
		// TODO Auto-generated method stub

	}

}
