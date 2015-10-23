package com.concepts.passbyvalue;

public class Test {

	public static void main(String[] args) {
		Balloon red = new Balloon("Red");
		Balloon blue = new Balloon("Blue");
		
		swap(red, blue);
		System.out.println(red.getColor());
		System.out.println(blue.getColor());
	
		foo(blue);
		System.out.println(blue.getColor());
		
		Test obj = null;
        System.out.println(obj.foo());
	}
	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	} 
	
	public static void foo(Balloon balloon){
		balloon.setColor("Red");
		balloon = new Balloon("Green");
		balloon.setColor("Blue");
	}
	
	public static String foo(){
        System.out.println("Test foo called");
        return "";
    }
}
