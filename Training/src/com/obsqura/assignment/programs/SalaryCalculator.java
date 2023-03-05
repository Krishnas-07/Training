
package com.obsqura.assignment.programs;

import java.util.Scanner;


public class SalaryCalculator {
	double basicpay,deduction,bonus;	
	public void salary (){
		
         System.out.println("Enter basicpay");
		Scanner sc=new Scanner(System.in);
		basicpay=sc.nextDouble();
		
		deduction=0.3*basicpay;
		bonus=0.15*basicpay;
		sc.close();
		System.out.println("Basic salary is      = "+basicpay);
		System.out.println("Deduction amount is  = "+deduction);
		System.out.println("Bonus amount is      =  "+bonus);
			
		}
		
		
	}

	
	 	
	

