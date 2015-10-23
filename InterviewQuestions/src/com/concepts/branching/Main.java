package com.concepts.branching;

public class Main {

	public static void main(String[] args) {
		int i, j;
		for(i=0;i<5;i++){
			System.out.println(i);
			if(i==2)
				
				break;
				
		}
		System.out.println("break");
		for(j=0;j<5;j++){
			System.out.println(j);
			if(j==3)
				
				continue;
		}
	}
}
