package com.interfaces.samples;

import com.classes.samples.Employee;
import com.classes.samples.Student;

public class TestPerson {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person ref;
		Student studentObject = new Student("John", "Smith", new Date(12, 5, 1968), Major.CIS);
		Employee employeeObject = new Employee("Jean", "Thomas", new Date(12, 13, 1968), new Date(1, 3, 1999));
		
		ref = studentObject; //Person reference points to a Student object
		System.out.println(ref.getName()); //polymorphism sample
		
		ref = employeeObject; //Person reference points to an employee object
		System.out.println(ref.getName()); //polymorphism sample
		
		studentObject.printInformation( studentObject );
		employeeObject.printInformation( employeeObject );
	}
}
