package com.obsqura.training.sum;

public class Divisible extends Sum {
void divisible()
{
	int sum=super.sum(10,20);
	if(sum%10==0)
	{
		System.out.println("Number is divisble by 10");
	}else
	{
		System.out.println(" Not divisible by 10");
	}
}

	public static void main(String[] args) {
	Divisible s=new Divisible();
	s.divisible();
	
	}

}
