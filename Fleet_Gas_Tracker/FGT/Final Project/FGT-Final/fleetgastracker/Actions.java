package fleetgastracker;

/**
 * 
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author the-beast
 * 
 */
public class Actions {

	private static final String ROOT_USERNAME = "root";
	private static final String ROOT_PASSWORD = "root";
	private static final String ROOT_CONN_STRING = "jdbc:mysql://localhost";

	public static void addVehicle(String vin, double capacity,
			double currentMiles, int active) throws SQLException {

		/**
		 * Connect to DB
		 */
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(ROOT_CONN_STRING, ROOT_USERNAME,
					ROOT_PASSWORD);
			System.out.println("connected!");
			stmt = conn.createStatement();
			String sql = "USE fgtdb";
			stmt.execute(sql);

			/****************************
			 **** Code to add values ****
			 ****************************/

			sql = "INSERT INTO Vehicles (VIN, GasCapacity, CurrentMiles, Active)"
					+ "VALUES"
					+ "('"
					+ vin
					+ "','"
					+ capacity
					+ "','"
					+ currentMiles + "','" + active + "')";
			stmt.execute(sql);

			System.out.println("The vehicle was added successfully");

		} catch (SQLException e) {

			if (e.getErrorCode() == 1007) {
				System.err.println("Can't Create Database, Already exist");
				return;
			} else
				System.err.println(e);

		} finally {
			if (conn != null) {
				conn.close();
			}

		}

	}

	/**
	 * Edit Vehicles
	 */
	public static void editVehicle(int id, String vin, double capacity,
			double currentMiles, int active) throws SQLException {

		/**
		 * Connect to DB
		 */
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(ROOT_CONN_STRING, ROOT_USERNAME,
					ROOT_PASSWORD);
			System.out.println("connected!");
			stmt = conn.createStatement();
			String sql = "USE fgtdb";
			stmt.execute(sql);

			/****************************
			 **** Code to edit values ****
			 ****************************/
			// Updates VIN #
			sql = "UPDATE Vehicles SET VIN = '" + vin + "' WHERE ID = '" + id
					+ "';";
			stmt.execute(sql);
			// Updates Tank Capacity
			sql = "UPDATE Vehicles SET GasCapacity = '" + capacity
					+ "' WHERE ID = '" + id + "';";
			stmt.execute(sql);
			// Updates Current Miles
			sql = "UPDATE Vehicles SET CurrentMiles = '" + currentMiles
					+ "' WHERE ID = '" + id + "';";
			stmt.execute(sql);
			// Updates Active
			sql = "UPDATE Vehicles SET Active = '" + active + "' WHERE ID = '"
					+ id + "';";
			stmt.execute(sql);

			System.out.println("The vehicle with " + id
					+ " was updated successfully");
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

	/**
	 * Remove Vehicles
	 */
	public static void removeVehicle(int id) throws SQLException {

		/**
		 * Connect to DB
		 */
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(ROOT_CONN_STRING, ROOT_USERNAME,
					ROOT_PASSWORD);
			System.out.println("connected!");
			stmt = conn.createStatement();
			String sql = "USE fgtdb";
			stmt.execute(sql);

			/********************************
			 **** Code to remove Vehicle ****
			 *******************************/

			sql = "DELETE FROM Vehicles WHERE ID = '" + id + "';";
			stmt.execute(sql);
			System.out.println("The Vehicle was deleted!");

		} catch (SQLException e) {

			if (e.getErrorCode() == 1007) {
				System.err.println("Can't Create Database, Already exist");
				return;
			} else
				System.err.println(e);

		} finally {
			if (conn != null) {
				conn.close();
			}

		}

	}
}
