package com.obsqura.assignment.exception;

public class Grade {
public static  void mark(int m) throws  ArithmeticException  {
if(m<45) {
	
		try {
			throw new Exception("Not Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	else {
		System.out.println(" passed");
	}
	
	
}
	public static void main(String[] args) {
	try {
		mark(29);
		
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
