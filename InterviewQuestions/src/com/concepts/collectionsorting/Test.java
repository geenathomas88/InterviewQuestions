package com.concepts.collectionsorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[5];
		empArr[0] = new Employee(1, 23, "Geena", 10000L);
		empArr[1] = new Employee(3, 23, "Remya", 20030L);
		empArr[2] = new Employee(45, 23, "Bibin", 10400L);
		empArr[3] = new Employee(15, 23, "Andrea", 45000L);
		empArr[4] = new Employee(23, 23, "Neena", 20040L);
		
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr));
		
		
		
		Arrays.sort(empArr, Employee.IdComparator);
		System.out.println(Arrays.toString(empArr));
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println(Arrays.toString(empArr));
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println(Arrays.toString(empArr));
		Arrays.sort(empArr, Employee.SalaryComparator);
		System.out.println(Arrays.toString(empArr));
	}
}
