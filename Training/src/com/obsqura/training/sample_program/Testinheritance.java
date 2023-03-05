package com.obsqura.training.sample_program;

public class Testinheritance implements Printable, Pintout {

	@Override
	public void display() {
		System.out.println("This is multiple inheritance");// TODO Auto-generated method stub
		
	}public static void main(String[] args) {
		Testinheritance t=new Testinheritance();
			t.display();
	}  

}
