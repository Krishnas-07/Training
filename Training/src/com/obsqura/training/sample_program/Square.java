package com.obsqura.training.sample_program;

public class Square extends Shape {

	@Override
	void print() {
		System.out.println("This is Square");
		
	}public static void main(String args[]){
		Square s=new Square();
		s.print();
	}

	
}
