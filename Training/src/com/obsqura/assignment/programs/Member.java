package com.obsqura.assignment.programs;

public class Member {
	String Name,Address;
	int  Age,Salary;
long Phone_number;
void memberdetails(String name,String Address,int age,long Phone_number,int salary) {
	this.Name=name;
	this.Age=age;
	this.Address=Address;
	this.Phone_number=Phone_number;
	this.Salary=salary;
	System.out.println("Name          : "+Name);
	System.out.println("Address       : "+Address);
	System.out.println("Age           :  "+Age);
	System.out.println("PhoneNumber   : "+Phone_number);
	System.out.println("Salary        : "+Salary);
}
void printSalary(int Salary)
{
	System.out.println("The Salary is "+Salary);
}
	 

}
