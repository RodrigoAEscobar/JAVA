package com.fleetgastracker.model;

import java.util.List;

public abstract class Vehicle {

	// private final String VIN;
	// private final int ID;
	// private final double gasCapacity;
	// private final boolean isActive;
	// private final VehicleType vehicleType;
	// private final double milesDriven;

	public static void insertVehicle(List<Vehicle> vehicles) {

	}

	public static class Builder {
		// Required parameters
		protected final String VIN;
		protected final int ID;
		protected VehicleType vehicleType;

		// Optional parameters
		protected double gasCapacity = 0.0;
		protected boolean isActive = true;
		protected double milesDriven = 0.0;

		public Builder(String VIN, int ID, VehicleType vehicleType) {
			this.VIN = VIN;
			this.ID = ID;
			this.vehicleType = vehicleType;
		}

		public Builder gasCapacity(double val) {
			gasCapacity = val;
			return this;
		}

		public Builder isActive(boolean val) {
			isActive = val;
			return this;
		}

		public Builder vehicleType(VehicleType val) {
			vehicleType = val;
			return this;
		}

		public Builder milesDriven(double val) {
			milesDriven = val;
			return this;
		}

		public Vehicle build() {
			switch (this.vehicleType) {
			case CAR:
				return new Car(this);
			case VAN:
				return new Car(this);
			case TRUCK:
				return new Car(this);
			default:
				return new Car(this);
			}

		}
	}

}
