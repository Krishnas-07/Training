package com.obsqura.training.program;

import java.util.Scanner;

public class Multiplication {
static double a,b,area;
void factors() {
	
	System.out.println("Enter side of trinagles");
	Scanner sc=new Scanner(System.in);
   a= sc.nextDouble();
   b=sc.nextDouble();
	sc.close();
	area=0.5*a*b;
	System.out.println("Area of Triangle is "+area);
}public static void main(String args[]) {
	Multiplication obj=new Multiplication();
	obj.factors();
	System.out.println(+area);
}}
