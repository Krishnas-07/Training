package com.obsqura.assignment.programs;

public class Divisible extends SumOfNumbers {
void divisible()
{
	int sum=super.sum(50,60);
	if(sum%10==0)
	{
		System.out.println("Number is Divible by 10");
	}else
	{
		System.out.println("Number is not Divisible");
	}
}
	public static void main(String[] args) {
	Divisible s=new Divisible();
    s.divisible();
	}

}
