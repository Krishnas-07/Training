package com.obsqura.assignment.programs;

public class Employee {
	double basic,da,hra,bonus,salary;
	void calculateSalary(double basic,double da,double hra) {
		this.basic=basic;
		this.da=da;
		this.hra=hra;
		 salary =basic+da+hra;
		 System.out.println("Salary is "+salary);
	}
public void calculateBonus() {
	double bonus=0.10*basic;
	System.out.println("Bonus salary  is "+bonus);
}
}
