package com.obsqura.training.aggregation_programs;

public class Address {
	String house_name,street_name,city_name,district,state,country;
	Student student;
public Address(String house_name, String street_name, String city_name, String district, String state,
			String country, Student student) {
		super();
		this.house_name = house_name;
		this.street_name = street_name;
		this.city_name = city_name;
		this.district = district;
		this.state = state;
		this.country = country;
		this.student = student;
	}public void display() {
		System.out.println("Name          :  "+student.name);
		System.out.println("Roll Number   :  "+student.roll_number);
		System.out.println("Address       :  "+house_name);
		System.out.println("                 "+street_name+","+city_name);
		System.out.println("                 "+district+","+country);
	}


public static void main(String args[]) {
	Student a=new Student("Krishna",29);
	Address obj=new Address("Neelamana Illom","Muttom PO ","Harippad","Alappuzha","Kerala","India",a);
	obj.display();
}
	
}