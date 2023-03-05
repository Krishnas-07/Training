package com.obsqura.assignment.collections;

import java.util.ArrayList;

public class Name {

	public static void main(String[] args) {
	ArrayList<String>Name=new ArrayList<>();
	Name.add("Krishna");
	Name.add("Vishnu");
	Name.add("Hari");
	Name.add("Amitha");
	Name.add("Respa");
	
	System.out.println("The names in collections are " +Name);		 
	Name.remove(2);
	
	System.out.println("The collection after removing the 3rd Element is" +Name);
	
	}

}
