package com.obsqura.training.program;

public class Palindrome {


	public static void main(String[] args) {
		String a="Malayalam";
		String rev="";
			int length=a.length();
			for(int i=length-1;i>=0;i--)
			{
				rev=rev+a.charAt(i);
			}if(a.equalsIgnoreCase(rev))
			{
				System.out.println("Is Palindrome");
			}else
			{
				System.out.println("Not Palindrome");
			}
	}

}
