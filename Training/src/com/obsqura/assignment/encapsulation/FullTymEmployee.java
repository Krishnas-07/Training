package com.obsqura.assignment.encapsulation;

public class FullTymEmployee extends Employee {

	

	@Override
	void calculateSalary(int payement, int workinghours) {
		salary=payement*workinghours;// TODO Auto-generated method stub
		System.out.println("The salary of Full Tym employee is "+salary);
	}public static void main(String[] args) {
		Contractor c=new Contractor();
			c.calculateSalary(800, 5);
			
			FullTymEmployee f=new FullTymEmployee();
			f.calculateSalary(1000, 8);// TODO Auto-generated method stub

	}

	
}
