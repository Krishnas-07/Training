package com.obsqura.assignment.interphase;

public class SumOfIntegers implements Sum, SumOfNumbers {

	@Override
	public int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}public static void main(String[] args) {
		SumOfIntegers s=new SumOfIntegers();
		int t=s.sum(45, 55);
		System.out.println("The sum of given numbers is "+t);
		

	}

}
