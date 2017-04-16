package com.fleetgastracker.model;

public class Car extends Vehicle {

	private final String VIN;
	private final int ID;
	private final double gasCapacity;
	private final boolean isActive;
	private final VehicleType vehicleType;
	private final double milesDriven;

	public Car(Builder builder) {
		VIN = builder.VIN;
		ID = builder.ID;
		gasCapacity = builder.gasCapacity;
		isActive = builder.isActive;
		vehicleType = builder.vehicleType;
		milesDriven = builder.milesDriven;

	}

}
