package com.codingchallenge;

public class Permutations {

	public static void main(String[] args) {
		String string = "abcd";
		permute(string, "");
	}
	public static void permute(String str, String prefix){
		if(str.length()==0)
			System.out.println(prefix);
		for(int i =0;i<str.length();i++){
		StringBuilder str1 = new StringBuilder(str);
		char a = str1.charAt(i);
		str1.deleteCharAt(i);
		String s1 = str1.toString();
		permute(s1,a+prefix);
		}
	}
}
