package com.concepts.collectionsorting;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int id, age;
	private String name;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(int id, int age, String name, long salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return (this.id-o.id);
	}
	
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (int) (o1.salary-o2.salary);
		}
		
	};
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (o1.age-o2.age);
		}
	};
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (o1.name.compareTo(o2.name));
		}
	};
	public static Comparator<Employee> IdComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (o1.id-o2.id);
		}
	};
}
