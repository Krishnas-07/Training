package com.obsqura.assignment.programs;

public class Rectangle {
int l,b;
Rectangle(int l,int b)
{
	this.l=l;
	this.b=b;
	
}void areaRectangle()
{
int area=l*b;
System.out.println("The area of Rectangle is " +area);
}void perimeterRectangle()
{
	int perimeter=2*(l+b);
	System.out.println("Perimeter of Rectangle is "+perimeter);
}
}