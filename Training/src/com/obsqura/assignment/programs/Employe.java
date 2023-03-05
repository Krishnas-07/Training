package com.obsqura.assignment.programs;

public class Employe extends Member {
void specialization(String a) {
	System.out.println("Specialaization   : "+a);
}void department(String b){
	System.out.println("Department  : "+b);
}void employeeDetails(){
	super.memberdetails("Alexa", "Abc Nagar", 15, 852369147, 100000);
	
}public static void main(String args[]) {
	Employe obj1=new Employe();
	obj1.employeeDetails();
	obj1.specialization("Civil Engineering");
	obj1.department("Engineering");
	Member obj3=new Member();
	obj3.printSalary(50000);
}
	
}

