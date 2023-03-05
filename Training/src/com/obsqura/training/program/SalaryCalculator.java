package com.obsqura.training.program;

public class SalaryCalculator {
double basicpay,deduction,bonus;
void salary() {
	basicpay=20000;
	deduction=0.3*basicpay;
	bonus=0.15*basicpay;
	System.out.println("Basic pay is "+basicpay);
	System.out.println("Deduction amount is "+deduction);
	System.out.println("Bpnus amount is "+bonus);
}

}

