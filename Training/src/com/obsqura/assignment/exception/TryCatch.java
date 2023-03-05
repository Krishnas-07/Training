package com.obsqura.assignment.exception;

public class TryCatch {
static	 int a;
public static void main(String[] args) {
	
try {
	a=5/0;
	System.out.println(a);
}catch(ArithmeticException e) {
	System.out.println("Number is not divisible by Zero");
}finally {
	System.out.println("You cannot divide a number with zero");
}
	
}
}
