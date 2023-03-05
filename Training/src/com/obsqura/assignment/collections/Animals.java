package com.obsqura.assignment.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Animals {

	public static void main(String[] args) 
	{
	ArrayList<String>Animals=new ArrayList<>();
	Animals.add( "Lion");
	Animals.add("Tiger");
	Animals.add( "Dear");
	Animals.add(" Elephant");
	Animals.add( " Ox");
	Animals.add( "Monkey");

	
System.out.println(Animals);

System.out.println("The 2nd element in the Collection is "+Animals.get(2));//Getting elements at specified argument
for(String name:Animals) {
	System.out.println(name);
}
Iterator<String> i= Animals.iterator();
	System.out.println("The collection list is ");
	while(i.hasNext()) {
		System.out.println(i.next());
}


}

}


