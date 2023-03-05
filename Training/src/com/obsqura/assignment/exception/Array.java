package com.obsqura.assignment.exception;

public class Array {

	public static void main(String[] args) {
		try{
			int arr[]=new int[5];
			System.out.println(arr[7]);// TODO Auto-generated method stub
		}catch(Exception e){
			System.out.println("Array out of bound Exception");
		}

	}

}
