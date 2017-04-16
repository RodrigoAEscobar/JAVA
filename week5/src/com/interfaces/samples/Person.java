package com.interfaces.samples;
public class Person extends APerson {
	/**
	 * @author rescobar
	 * @param first
	 * @param last
	 * @param dateOfBirth
	 */
	public Person(String first, String last, Date dateOfBirth) {
		super(first, last, dateOfBirth);
	}

	public String getName() {
		System.out.println("Person: default getName");
		return firstName + " " + lastName;
	}

	@Override
	public void printInformation(APerson p) {
		System.out.println("I am a Person called " + p.getName());
	}
}