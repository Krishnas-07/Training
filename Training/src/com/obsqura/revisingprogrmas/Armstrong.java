package com.obsqura.revisingprogrmas;

public class Armstrong {
	int a,rem,sum=0,temp;
public  int reverse(int a)
{while(a!=0) {
	rem=a%10;
	sum=sum+rem*rem*rem;
	 a=a/10;
		
}
return sum;	
}
public void number() {
	if(temp==a) {
		System.out.println("Number is Armstrong");
	}else {
		System.out.println("Not Armstrong");
	}
}
	public static void main(String[] args) {
		
		Armstrong obj=new Armstrong();
		Armstrong obj1=new Armstrong();
		int s=obj.reverse(152);
		obj1.number();
		System.out.println(s);
	// TODO Auto-generated method stub


	}

}
