package com.Arrays.examples;

import java.util.Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		/*String[][] names= {{"Mr. ","Miss. ","Mrs ."},{"Mass", "Malli"}};
		System.out.println("Two dimenstional array length:"+names.length);
		for(String[] s:names) {
			for(String s1:s) {
				System.out.println(s1+" ");
			}
		}*/
		
		int[][] arr= {{12,34,1,45,56,567},{34,3,6,7},{2}};
		System.out.println("before sorting array :");
		for(int[] arr1:arr) {
			for(int i:arr1) {
				System.out.println(i);
			}
		}
		System.out.println("========================================");
		Arrays.sort(arr);
		for(int[] arr1:arr) {
			for(int i:arr1) {
				System.out.print(i+" ");
			}
		}
		

	}

}
