package com.obsqura.revisingprogrmas;

public class Palindrome {
static int a,rem=0,rev=0;
 

public static  int reverse(int a){
	while(a!=0) {
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		
	}
	return rev;
}
	public static void checkPalindrome() {
		int temp=a;
		if(rev==temp) {
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");

		
	}}
		public static void main(String args[])
	{
		int s=Palindrome.reverse(123);
		Palindrome.checkPalindrome();
		System.out.println(s);
		
		
	
	
	
}}
