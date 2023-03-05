package com.obsqura.assignment.collections;

import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		ArrayList<String>Fruits=new ArrayList<>();
		Fruits.add("Apple");
		Fruits.add("Mango");
		Fruits.add("Banana");
		Fruits.add("Pappaya");
		Fruits.add("Pineapple");
		
		
		System.out.println("The fruits in collection are"+Fruits);
		if(Fruits.contains("Guva")) {
			System.out.println("True");
		}else {
		System.out.println("False");
		}if(Fruits.contains("Apple")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		}

	}

