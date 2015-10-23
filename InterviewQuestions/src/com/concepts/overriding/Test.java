package com.concepts.overriding;

public class Test {

	public static void main(String[] args) {
		BaseClass bc = new ChildClass();
		bc.doSomething("hi");
	}

}
