package com.obsqura.training.aggregation_programs;

public class Lineitems {
	String quantity;
	Product product;
public Lineitems(String quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}public void display() {
		System.out.println("Product       : "+product.name);
		System.out.println("Id            :"+product.id);
		System.out.println("Description   : "+product.description);
		System.out.println("Quantity      : "+quantity);
		
	}



	public static void main(String[] args) {
		Product obj=new Product(123,"Kunafa","Dessert");// TODO Auto-generated method stub
        Product obj1=new Product(147,"DairyMilk","Choclate");
        Lineitems obj2=new Lineitems("300gm",obj);
        Lineitems obj3=new Lineitems("250gm",obj1);
        obj2.display();
        System.out.println("Next item");
        obj3.display();
	}

}
