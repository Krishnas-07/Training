package com.obsqura.assignment.programs;

public class TotalSalary extends CalculateHraPf {
 double netSalary;
	void grosssalary()
	{super.calculate();
		netSalary=super.basicpay+super.h-super.p-super.deduction+super.bonus;
		System.out.println("The Net Salary Amount is "+netSalary);
		
	}
	public static void main(String[] args) {
		
		TotalSalary c=new TotalSalary();
		c.grosssalary();
		
	
		
	}

}
