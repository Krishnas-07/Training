package com.obsqura.training.program;

public class Division extends Addition {
void divisible() {
	super.Sum(10000, 2000);
	if(sum<15000)
	{
		System.out.println("Number is less thsn 150000");
	}else {
		System.out.println("Nuber is greater than 15000");
	}
	
}public static void main(String args[]) {
	Addition obj=new Addition();
	obj.Sum(10000,2000);
	System.out.println("Sum of Number is"+sum);
	Division obj1=new Division();
	obj1.divisible();
	
}
}
