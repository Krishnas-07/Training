package com.obsqura.assignment.programs;

public class CalculateHraPf extends SalaryCalculator {
	 double h,p;
	public void calculate()
	 { super.salary();
		 h=0.05*basicpay;
		 p=0.2*basicpay;
		System.out.println("Hra Amount is   ="+h); 
		System.out.println(" Pf Amount is   ="+p);
		    
	 }

	
}

