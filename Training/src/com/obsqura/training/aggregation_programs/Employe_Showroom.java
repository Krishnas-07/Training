package com.obsqura.training.aggregation_programs;

public class Employe_Showroom {
String name;
int id;
Car car; 
Bike bike;
public Employe_Showroom(String name, int id, Car car, Bike bike) {
	super();
	this.name = name;
	this.id = id;
	this.car = car;
	this.bike = bike;
}public void display() {
	System.out.println("Employee Details   : "+name);
	System.out.println("Employee Id        : "+id);
	System.out.println("Car Details        : "+car.carname+  " , Colour: " +car.colour+ " , Register Number : "+car.register_number);
	System.out.println("Bike details       : "+bike.bike_name+", Register Numberb: "+bike.register_Number);
}

	public static void main(String[] args) {
	Car c1=new Car("Red","KIA",159);
	Bike b1=new Bike("Bullet",753);
	Employe_Showroom es= new Employe_Showroom("Akash",1469,c1,b1);// TODO Auto-generated method stub
    es.display();
	}

}
