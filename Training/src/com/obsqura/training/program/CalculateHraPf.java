package com.obsqura.training.program;

public class CalculateHraPf extends SalaryCalculator {
double h,p;
void calculate() {
super.salary();
	h=super.basicpay*0.05;
	p=super.basicpay*0.20;
	System.out.println("Hra amount is "+h);
	System.out.println("Pf amount is "+p);
}
}
