package com.obsqura.training.sample_program;

public class Student {
int id;
String name;
Address address;
	

	public Student(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}public void display() {
System.out.println(id);
System.out.println(name);
System.out.println(address.house_name+" , "+address.city_name+" , "+address.state_name+" , " +address.country+" , " +address.pin);
}


	public static void main(String[] args) {
		Address add1=new Address("ABC HOUSE","Harippad","Kerala","India",690511);
		Address add2=new Address("yuo","ekm","kerala","india",698755);
		Student st1=new Student(12,"Krishna",add1);
		Student st2=new Student (14,"priya",add2);
		st1.display();
		st2.display();
	}

}
