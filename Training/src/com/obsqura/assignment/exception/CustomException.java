package com.obsqura.assignment.exception;

public class CustomException {
	static int a;
public static void age(int a)throws InvalidAge {
	if(a>18)
	{
		System.out.println("Eligible for Voting");
	}else {
		System.out.println("Not Eligible");
		
	}
}
public static void main(String[] args )  {
	try {
		age(12);
		
	}catch(Exception e) {
		
	}
}
}
