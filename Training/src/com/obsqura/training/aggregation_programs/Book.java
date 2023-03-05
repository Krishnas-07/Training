package com.obsqura.training.aggregation_programs;

public class Book {
String name;
int price;
Author author;

public Book(String name, int price, Author author) {
	super();
	this.name = name;
	this.price = price;
	this.author = author;
}public void display() {
	System.out.println(" Book                 :  "+name);
	System.out.println("Written by            :  "+author.name+","+author.place);
	System.out.println("Age of Author         :  "+author.age);
    System.out.println("Price of Book         :  "+price);
	
}


	public static void main(String[] args) {
	Author a=new Author("Chethan Bhagat","New Delhi",50);
	Book b=new  Book("Two States",300,a);
    b.display();
	}

}
