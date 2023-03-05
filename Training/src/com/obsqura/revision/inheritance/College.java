package com.obsqura.revision.inheritance;

public class College extends Details {
public void college(String b)
{
	super.name("Krishnapriya");
    super.details(29,"SBC");
   
  
	System.out.println("College name : "+b);
}
	public static void main(String[] args) {
		College  c=new College();
		c.college("Sree Buddha College of Engineering");


}}

