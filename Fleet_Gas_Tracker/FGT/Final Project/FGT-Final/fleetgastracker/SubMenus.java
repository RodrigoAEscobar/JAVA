package fleetgastracker;


import java.sql.SQLException;
import java.util.Scanner;

import fleetgastracker.Driver;
import fleetgastracker.Car;

public class SubMenus {

	/**
	 * Sub Menu # 1 Manage Vehicles
	 * 
	 * @throws SQLException
	 */
	public static void one() throws InterruptedException, SQLException {
		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		do {
			System.out.println("1.Add A Vehicle");
			System.out.println("2.Modify A Vehicle");
			System.out.println("3.Remove A Vehicle");
			System.out.println("4.Back");

			@SuppressWarnings("resource")
			Scanner sd = new Scanner(System.in);
			System.out.println("Please enter your choice: ");
			int num = sd.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter VIN number:");
				String add_Vin = sc.next();
				System.out.println("Enter Gas Capacity number:");
				double add_capacity = sc.nextDouble();
				System.out.println("Enter Current Miles number:");
				double add_currentMiles = sc.nextDouble();
				System.out
						.println("Is this vehicle active?  use 1 for YES or 0 for NO:");
				int add_active = sc.nextInt();

				Actions.addVehicle(add_Vin, add_capacity, add_currentMiles,
						add_active);

				break;

			case 2:
				System.out.println("Enter the vehicle ID number:");
				int id = sc.nextInt();
				System.out.println("Enter VIN number:");
				String vin = sc.next();
				System.out.println("Enter Gas Capacity number:");
				double capacity = sc.nextDouble();
				System.out.println("Enter Current Miles number:");
				double currentMiles = sc.nextDouble();
				System.out
						.println("Is this vehicle active?  use 1 for YES or 0 for NO:");
				int active = sc.nextInt();

				Actions.editVehicle(id, vin, capacity, currentMiles, active);
				break;

			case 3:
				System.out.println("Enter the vehicle ID number:");
				int del_Id = sc.nextInt();
				Actions.removeVehicle(del_Id);
				break;

			case 4:
				exit = true;
				break;
			}
		} while (!exit);
	}

	public static void two() {

	}
}
