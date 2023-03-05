package com.obsqura.assignment.programs;

public class OffSeason {
double amount,offseason_price;
void discount(double amount)
{
	amount=amount-(0.15*amount);
	System.out.println("The Total Amount after normal discount is "+amount);
}
}
