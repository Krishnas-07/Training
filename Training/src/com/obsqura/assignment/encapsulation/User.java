package com.obsqura.assignment.encapsulation;

public class User {
	
	

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.getPin();
		int a=b1.setPin(1587);
		if( a==1001||a==1234||a==1212) {
			System.out.println("The pin is valid ");	
		}else {
			System.out.println("The pin is not valid ");
		}	
		


	}
	

}
