package com.obsqura.assignment.programs;

public class Child_Class extends Parent_Class{
public void child()
{
	System.out.println("This is Child Class.");
}
	public static void main(String[] args) {
		Child_Class obj2=new Child_Class();
		obj2.child();
		Parent_Class obj1=new Parent_Class();
		obj1.parent();
		obj2.parent();
	}

}
