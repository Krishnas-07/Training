package com.obsqura.training.aggregation_programs;

import com.obsqura.revision.inheritance.Bakery;

public class Invoice {
public void footer()
{
	System.out.println("Thank u Come Again");
}
	public static void main(String[] args) {
		Bakery b=new Bakery();
		b.bakery("Bread", 45);
		Invoice i=new Invoice();
		i.footer();
		// TODO Auto-generated method stub

	}

}
