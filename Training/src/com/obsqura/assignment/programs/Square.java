package com.obsqura.assignment.programs;

public class Square extends Rectangle {
int s;
	public Square(int s) {
		super(s, s);
		this.s=s;
		
	}void areaSquare()
	{
		int area=s*s;
		System.out.println("Area of Square is "+area);
		
	}void perimeterSquare()
	{
		int perimeter=4*s;
		System.out.println("Perimeter of Square is "+perimeter);
		
	}

	public static void main(String[] args) {
		Rectangle a=new Rectangle(10,20);
		a.areaRectangle();
		a.perimeterRectangle();
		Square obj2=new Square(10);
		obj2.areaSquare();
obj2.perimeterSquare();
	}

}
