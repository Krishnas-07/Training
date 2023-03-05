package com.obsqura.assignment.programs;

public class Address extends Student {
String housename,state;
int pincode;
void housedetails(String housename,String state,int pincode)
{
	System.out.println("Address is "+housename+","+state+","+pincode);
}
	public static void main(String[] args) {
		Student s=new Student();
		s.details("priya",25);
		Address a=new Address();
			a.housedetails("Sreenilayam", "Kerala", 123654);
			

	}

}
