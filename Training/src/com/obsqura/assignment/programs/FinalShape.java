package com.obsqura.assignment.programs;

public class FinalShape extends RectangleShape {
void Squareshape() {
	System.out.println("Square is a Rectangle");
}public static void main(String args[])
{
	FinalShape obj=new FinalShape();
	obj.Squareshape();
	obj.printRectangle();
	obj.printshape();
	CircularShape obj1=new CircularShape();
	obj1.circularShape();
}
}
