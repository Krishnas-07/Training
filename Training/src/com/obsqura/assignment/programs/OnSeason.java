package com.obsqura.assignment.programs;

public class OnSeason extends OffSeason {
	double price;
void discount(double price)
{price=price-(0.4*price);
System.out.println("The amount after Seasonal discount is "+price);	
}
	public static void main(String[] args) {
OffSeason a=new OffSeason();
a.discount(15000);
OnSeason b=new OnSeason();
b.discount(15000);
	}
	

}
