package com.oop.samples;
/**
 * 
 * @author aescobar
 *	this class represents a Car with the following characteristics
 *		plateNumber	:	6 alphanumeric string 
 *		bodyColor	:	color of the car
 *		manufacturer:	maker of the car
 *		carSpeed    :	how fast it travels (Miles/Hr)
 *		year		:	year it was produced
 *		model		:	model of the car
 */
public class Car {
	// Instance Variables
	private String plateNumber ;
	private int year;
	private double carSpeed;
	
	// Class Variables
	static int counter = 0;

	// Constructors
	public Car(String plateNumber, int year){
		this.plateNumber = plateNumber;
		this.year = year;
		this.carSpeed = 0.0;
		counter++;
	}
	
	// Instance Methods
	
	public void accelerate (double increment){
		this.carSpeed += increment;
	}

	// Class Methods
	
	static void resetCounter (){
		counter = 0;
	}
	
	// Getters and Setters
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCarSpeed() {
		return carSpeed;
	}
	
}
