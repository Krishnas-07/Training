package com.obsqura.training.aggregation_programs;

import com.obsqura.revision.inheritance.Subtraction;

public class Division {
public void division(int a,int b)
{
	int div=(a/b);
	System.out.println(div);
}
public static void main(String args[])
{
	Division obj=new Division();
	obj.division(10, 5);
	Subtraction obj1=new Subtraction();
	obj1.sub(10,5);
	
}
}
