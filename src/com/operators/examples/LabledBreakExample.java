package com.operators.examples;

public class LabledBreakExample {

	public static void main(String[] args) {
		
		int[][] arr= {
				
				{ 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }};

		int searchno=35;
		boolean flag=false;
		Search:for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==searchno) {
					System.out.println("search number found at: "+i+" --- > "+j);
					flag=true;
					break Search;
				}
				 
			}
		}
		if(!flag) 
			System.out.println("not found in that array: ");
		
		
	}

}
