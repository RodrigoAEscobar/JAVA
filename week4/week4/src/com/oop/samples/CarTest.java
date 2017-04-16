package com.oop.samples;
/**
 * @author aescobar
 * CarTest is a class that tests our other class called Car.  It shows us how to create new
 * instances of Car(s), and how to assign values to Instance variables and how to call Instance methods.
 * It finally shows us how to access Class (static) variables and methods.
 * 
 * */
public class CarTest {
	
	public static void main(String[] args) {
		Car carA = new Car("XYD-456", 1963);
		System.out.println(carA.getPlateNumber());
		System.out.println(Car.counter);
		System.out.println(carA.getCarSpeed());
		carA.accelerate(100.0);
		System.out.println(carA.getCarSpeed());
		Car carB = new Car("KUD-999", 2002);		
		System.out.println(carB.getPlateNumber());
		System.out.println(Car.counter);
		Car.resetCounter();
		System.out.println(Car.counter);
	}
}