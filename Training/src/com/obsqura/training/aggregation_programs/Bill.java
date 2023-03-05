package com.obsqura.training.aggregation_programs;

import com.obsqura.revision.inheritance.Construction;

public class Bill {
int a=650,b=85,c=400,d=1000;
public void bill() {
	System.out.println("Bill amount are "+a+ " ,"+b+ " , "+c+ " ,"+d);
}


	public static void main(String[] args) {
		Construction c=new Construction();
		c.materials();// TODO Auto-generated method stub
        Bill b=new Bill();
        b.bill();
	}

}
