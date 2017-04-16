package com.classes.samples;

import java.util.Scanner;

import com.interfaces.samples.Date;

public class SalaryDemo {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new HourlyEmployee("Harry", "Morgan", new Date(12, 5, 1968), new Date(12, 5, 1999), 30);
		staff[1] = new SalariedEmployee("Lin, Sally", null, new Date(1, 5, 1978), new Date(12, 5, 1999), 52000);
		staff[2] = new Manager("Mary", "Smith", new Date(8, 6, 1988), new Date(12, 5, 1999), 104000, 50);

		Scanner in = new Scanner(System.in);
		for (Employee e : staff) {
			System.out.print("Hours worked by " + e.getName() + ": ");
			int hours = in.nextInt();
			System.out.println("Salary: " + e.weeklyPay(hours));
		}
	}
}
