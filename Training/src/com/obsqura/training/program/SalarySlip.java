package com.obsqura.training.program;

public class SalarySlip extends CalculateHraPf {
double totalSalary;
public	void slip() {
super.calculate();
totalSalary=super.basicpay + super.bonus +super.h-super.deduction-super.p;
System.out.println("Total salary is "+totalSalary);
	}
	public static void main(String[] args) {
		
		SalarySlip obj3=new SalarySlip();
		obj3.slip();
	}

}
