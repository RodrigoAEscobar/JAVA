package com.classes.samples;

import com.interfaces.samples.Date;

public class SalariedEmployee extends Employee {
	private double annualSalary;

	/**
	 * Constructs a salaried employee with a given name and annual salary.
	 * 
	 * @param name
	 *            the name of this employee
	 * @param salary
	 *            the annual salary
	 */
	public SalariedEmployee(String first, String last, Date dateOfBirth, Date dateOfHire, double salary) {
		super(first, last, dateOfBirth, dateOfHire);
		annualSalary = salary;
	}

	public double weeklyPay(int hoursWorked) {
		final int WEEKS_PER_YEAR = 52;
		return annualSalary / WEEKS_PER_YEAR;
	}
}
