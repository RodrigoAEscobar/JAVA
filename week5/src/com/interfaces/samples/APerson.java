package com.interfaces.samples;

public abstract class APerson implements IPerson {
		protected String firstName;
		protected String lastName;
		protected Date birthDate;

		/**
		 * @author rescobar
		 * @param first
		 * @param last
		 * @param dateOfBirth
		 */
		public APerson(String first, String last, Date dateOfBirth) {
			firstName = first;
			lastName = last;
			birthDate = dateOfBirth;
		}

		@Override
		public void printInformation(APerson p) {
			System.out.println(p.toString());
		}
		
		public abstract String getName();

	}