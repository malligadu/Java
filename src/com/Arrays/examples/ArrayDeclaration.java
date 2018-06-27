package com.Arrays.examples;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		// Array declaration
		
		int[] arr=new int[10];
		int[] arr1={43,45,56,67,23,78};
		System.out.println("array length: "+arr.length);
		
		try {
		System.out.println("10 th index value is: "+arr[10]);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getStackTrace());
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+10;
		}
		
		//for iterating
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" th index value: "+arr[i]);
		}
		

	}

}
