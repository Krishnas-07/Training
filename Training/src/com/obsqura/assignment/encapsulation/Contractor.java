package com.obsqura.assignment.encapsulation;

public class Contractor extends Employee {

	
	
	@Override
	void calculateSalary(int payement, int workinghours) {
		salary=payement*workinghours;// TODO Auto-generated method stub
		System.out.println("The salary of part time employee is "+salary);
	}

}
