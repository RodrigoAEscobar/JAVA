package com.classes.samples;

import com.interfaces.samples.APerson;
import com.interfaces.samples.Date;
import com.interfaces.samples.Major;
import com.interfaces.samples.Person;

/**
 * 
 * @author rescobar
 *
 */
public class Student extends Person {
	private Major major;

	// Student constructor
	public Student(String first, String last, Date dateOfBirth, Major major) {
		super(first, last, dateOfBirth);
		this.major = major;
		// constructor to initialize Person and hire date
	} // end Student constructor

	@Override
	public String getName() {
		System.out.println("Student: getName");
		return this.firstName + " " + this.lastName;
	}

	@Override
	public void printInformation(APerson p) {
		System.out.println(getName() + " and i am a " + this.major + " student");
	}
}
