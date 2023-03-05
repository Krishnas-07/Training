package com.obsqura.training.aggregation_programs;

public class Employee {
String employee_name;
int employee_id;
Car car;

public Employee(String employee_name, int employee_id, Car car) {
	super();
	this.employee_name = employee_name;
	this.employee_id = employee_id;
	this.car = car;
}public void display() {
	System.out.println("Employee details       : "+employee_name);
	System.out.println("Eployee Id             : "+employee_id);
	System.out.println("Car Model              : "+car.carname);
	System.out.println("Colour                 : "+car.colour);
	System.out.println("Model number           : "+car.register_number);
}


	public static void main(String[] args) {
		Car c1=new Car("White","Figo",123);
		Car c2=new Car("Silver","Scorpio",456);
		Car c3=new Car("Black","Compass Jeep",789);
		Employee e1=new Employee("Vishnu",789,c1);
        Employee e2=new Employee("Hari",123,c2);
        Employee e3=new Employee("Rohit",456,c3);
        e1.display();
        System.out.println("second Employee");
        e2.display();
        System.out.println("Third Employee");
        e3.display();
	}

}
