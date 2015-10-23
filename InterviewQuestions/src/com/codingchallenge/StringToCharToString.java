package com.codingchallenge;

import java.util.Arrays;

public class StringToCharToString {

	public static void main(String[] args) {
		String str = "abc";
		char[] charArray= str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		char c = str.charAt(1);
		System.out.println(c);
	}
}
