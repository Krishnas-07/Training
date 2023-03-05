package com.obsqura.assignment.interphase;

public class Rectangle implements Polygon {
int area;
	@Override
	public void getArea(int length, int breadth) {
	 area=length*breadth;
	 System.out.println("The area of Rectangle is "+area);
	
	}public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.getArea(25, 35 );
	}

}
