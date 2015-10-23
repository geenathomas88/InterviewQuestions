package com.concepts.composition;

public class Person {

	private Job job;

	public Person() {
		super();
		this.job = new Job();
		job.setSalary(1000L);
	}
	public long getSalary(){
		return job.getSalary();
	}
}
