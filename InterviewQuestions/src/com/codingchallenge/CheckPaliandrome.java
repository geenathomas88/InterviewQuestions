package com.codingchallenge;

public class CheckPaliandrome {

	public static void main(String[] args) {
		
		String string = "malayalam";
		System.out.println(isPaliandrome(string));
		
	}

	public static boolean isPaliandrome(String str){
		if(str.length()==0)
			return false;
		for(int i = 0; i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}
