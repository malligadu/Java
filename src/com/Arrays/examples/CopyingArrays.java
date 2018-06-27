package com.Arrays.examples;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		char[] chFrom= {'m','a','l','l','i','k','a','r','j','u','n','a','r','a','o'};
		//char[] chTo=new char[9];
		
		//System.arraycopy(chFrom, 0, chTo, 0, 9);
		char[] chTo=Arrays.copyOfRange(chFrom, 0, 9);
		System.out.println(new String(chTo));

	}

}
