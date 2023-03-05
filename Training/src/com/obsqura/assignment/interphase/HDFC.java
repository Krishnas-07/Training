package com.obsqura.assignment.interphase;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(double interestrate, double amount, double duration) {
	double Amount =interestrate*amount*duration;	
	System.out.println("The Amount is "+Amount);	
	}
public static void main(String args[]) {
	double f=RBI.rate();
	HDFC l=new HDFC();
	l.recurringDeposit(f, 100000, 10);
	
}
	
	
}
