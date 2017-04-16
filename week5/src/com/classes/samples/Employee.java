package com.classes.samples;

import com.interfaces.samples.APerson;
import com.interfaces.samples.Date;
import com.interfaces.samples.Person;

/**
 * 
 * @author rescobar
 * 
 */
public class Employee extends Person {
	private Date hireDate;

	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
		super(first, last, dateOfBirth);
		this.hireDate = dateOfHire;
		// constructor to initialize Person and hire date
	} // end Employee constructor

	// convert Employee to String format
	@Override
	public String toString() {
		return String.format("%s, %s  Hired: %s  Birthday: %s", lastName, firstName, hireDate, birthDate);
	} // end method toEmployeeString

	@Override
	public String getName() {
		System.out.println("Employee: getName");
		return this.firstName + " " + this.lastName;
	}

	@Override
	public void printInformation(APerson p) {
		System.out.println(p.getName() + " and i was hired on " + this.hireDate);
	}

	public double weeklyPay(int hoursWorked) {
		return 0;
	}
} // end class Employee
