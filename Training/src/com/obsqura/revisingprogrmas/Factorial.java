package com.obsqura.revisingprogrmas;

public class Factorial {
static int fact;
public static  int number(int a) {
	int fact=1;
	for(int i=1;i<=a;i++) {
		fact=fact*i;
		
	}
	return fact;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int s= Factorial.number(5);
    System.out.println(s);
    System.out.println("Factorial is " +s);
	}

}
