package com.obsqura.assignment.programs;

public class Manager_Class extends Member {
void department(String c) {
	System.out.println("Depatment      : "+c);
}void specialization(String d){
	System.out.println("Specialiazation   : "+d);
}void managerdetails(){
	super.memberdetails("Eby", "Harihar Nagar", 24, 78945612, 50000);
	
}
	public static void main(String[] args) {
	Manager_Class obj2=new 	Manager_Class();
	obj2.managerdetails();
	obj2.department("Accounting");
	obj2.specialization("CMA");
	Member obj4=new Member();
	obj4.printSalary(50000);
	}

}
