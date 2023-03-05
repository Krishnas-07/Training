package com.obsqura.assignment.programs;

public class TestInheritance {

	public static void main(String[] args) {
		System.out.println("Employee Salary details");
		Employee a=new Employee();
		a.calculateSalary(15000,5000,2000);
		a.calculateBonus();
		System.out.println("Manager salary details");
		Manager b=new Manager();
		b.managerSalary();
		System.out.println("Accountantsalary details");
		Accountant c=new Accountant();
		c.accountantSalary();

}}
