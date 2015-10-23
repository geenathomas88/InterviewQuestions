package com.codingchallenge;

public class RemoveCharacter {
 
	public static void main(String[] args) {
		String string = "hello";
		System.out.println(removeCharacter(string, 'l'));
	}
	
	public static String removeCharacter(String str, char ch){
		 return str.replaceAll(Character.toString(ch), "");
	}
}
