package com.classes.samples;

import com.interfaces.samples.Date;

public class Manager extends SalariedEmployee {
	private double weeklyBonus;

	/**
	 * Constructs a manager with a given name, annual salary and weekly bonus.
	 * 
	 * @param name
	 *            the name of this employee
	 * @param salary
	 *            the annual salary
	 * @param bonus
	 *            the weekly bonus
	 */
	public Manager(String first, String last, Date dateOfBirth, Date dateOfHire, double salary, double bonus) {
		super(first, last, dateOfBirth, dateOfHire, salary);
		weeklyBonus = bonus;
	}

	public double weeklyPay(int hours) {
		return super.weeklyPay(hours) + weeklyBonus;
	}
}
