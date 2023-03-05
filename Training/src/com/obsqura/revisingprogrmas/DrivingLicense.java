package com.obsqura.revisingprogrmas;

public class DrivingLicense {

	static int criteria(int age)
	{

		if(age>18) {
			System.out.println("Eligible for License");// TODO Auto-generated method stub
		}else
		{
			System.out.println("Not Eligible");
			
		}
		return age;
				
	}	
	
	
	


	public static void main(String[] args) {
		System.out.println("Enter the age :");
		int s=DrivingLicense.criteria(19);
		System.out.println("The age is " +s);
		int v=DrivingLicense.criteria(17);
		
		System.out.println("The age is " +v);
			
	}

}
