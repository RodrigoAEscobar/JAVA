package fleetgastracker;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fleetgastracker.GasType;

public enum DataSourcesSingleton {

    INSTANCE;
/**
 * Database credentials need to match the existing SQL server
 * CONN_STRING = "jdbc:mysql://Database_Path/fgtdb";
 * ROOT_CONN_STRING = "jdbc:mysql://localhost";
 */
    private static final String ROOT_USERNAME = "Insert_Database_Root_Username";
    private static final String ROOT_PASSWORD = "Insert_Database_Password";
    @SuppressWarnings("unused")
    private static final String CONN_STRING = "jdbc:mysql://localhost/fgtdb";
    private static final String ROOT_CONN_STRING = "jdbc:mysql://localhost";

    
    public static void createDatabase() throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(ROOT_CONN_STRING, ROOT_USERNAME,
                    ROOT_PASSWORD);
            System.out.println("connected!");
            stmt = conn.createStatement();

            String sql = "CREATE DATABASE fgtdb";
            stmt.executeUpdate(sql);

            System.out.println("Database Created");

            sql = "USE fgtdb";

            stmt.execute(sql);

            /****************************
             **** Code to add tables ****
             ****************************/

            sql = "CREATE TABLE Vehicles"
                    + "(ID MEDIUMINT NOT NULL AUTO_INCREMENT,"
                    + "VIN VARCHAR (255) NOT NULL,"
                    + "GasCapacity FLOAT NOT NULL,"
                    + "CurrentMiles FLOAT NOT NULL,"
                    + "Active MEDIUMINT NOT NULL,"
                    + "DriversID INTEGER NULL REFERENCES Drivers(ID),"
                    + "VehicleTypesId INTEGER NULL REFERENCES VehicleTypes(ID),"
                    + "FleetId INTEGER NULL REFERENCES Fleets(ID),"
                    + "PRIMARY KEY (ID))" + "ENGINE=MyISAM;";
            stmt.execute(sql);

            sql = "INSERT INTO Vehicles (VIN, GasCapacity, CurrentMiles, Active)"
                    + "VALUES"
                    + "('2H2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('5J2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('6D2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('7R2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('2O2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('9A2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('3Y2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('4P2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('6S2GP12PXY2203241', '11.0', '15136.15', '1'),"
                    + "('1M2GP12PXY2203241', '11.0', '15136.15', '1')";
            stmt.execute(sql);

            sql = "CREATE TABLE VehicleTypes"
                    + "(ID MEDIUMINT NOT NULL AUTO_INCREMENT,"
                    + "Type VARCHAR (255) NOT NULL,"
                    + "RequireGasType VARCHAR (255) NOT NULL,"
                    + "GasType VARCHAR (255) NOT NULL REFERENCES GasPrice(GasType),"
                    + "PRIMARY KEY (ID))" + "ENGINE=MyISAM;";
            stmt.execute(sql);

            sql = "CREATE TABLE Fleets"
                    + "(ID MEDIUMINT NOT NULL AUTO_INCREMENT,"
                    + "Name VARCHAR (255) NOT NULL,"
                    + "Location VARCHAR (255) NOT NULL REFERENCES Locations(State),"
                    + "PRIMARY KEY (ID))" + "ENGINE=MyISAM;";
            stmt.execute(sql);

            sql = "CREATE TABLE GasPrice" + "(GasType VARCHAR (255) NULL,"
                    + "Price FLOAT NOT NULL," + "PRIMARY KEY (GasType))";
            stmt.execute(sql);
            sql = "INSERT INTO GasPrice (GasType, Price)" + "VALUES"
                    + "('Regular', '3.45')," + "('Medium', '3.67'),"
                    + "('Premium', '3.89')," + "('Diesel', '3.99')";
            stmt.execute(sql);

            sql = "CREATE TABLE Location" + "(State VARCHAR (255) NOT NULL,"
                    + "City VARCHAR (255) NOT NULL," + "PRIMARY KEY (State))";
            stmt.execute(sql);

            sql = "CREATE TABLE Drivers"
                    + "(ID MEDIUMINT NOT NULL AUTO_INCREMENT,"
                    + "Name VARCHAR (255) NOT NULL,"
                    + "VehiclesID INTEGER NOT NULL," + "PRIMARY KEY (ID))";
            stmt.execute(sql);

            sql = "CREATE TABLE PhoneNumbers" + "(DriverID INTEGER NOT NULL,"
                    + "Cell VARCHAR (15) NOT NULL,"
                    + "Home VARCHAR (15) NOT NULL,"
                    + "Other VARCHAR (15) NOT NULL,"
                    + "PRIMARY KEY (DriverID))";
            stmt.execute(sql);

            sql = "CREATE TABLE Transaction" + "(Date VARCHAR (255) NOT NULL,"
                    + "DriverID INTEGER NOT NULL,"
                    + "VehicleID INTEGER NOT NULL,"
                    + "GasType VARCHAR (255) NOT NULL,"
                    + "TotalGallons INTEGER NOT NULL," + "PRIMARY KEY (Date))";
            stmt.execute(sql);

            /************************************
             **** Code to UPDATE INFORMATION ****
             ************************************/

            sql = "UPDATE GasPrice SET Price = '3.49' WHERE GasType = 'Diesel';";
            stmt.execute(sql);
            System.out.println("The Diesel Price was updated!");

            /************************************
             **** Code to READ INFORMATION ****
             ************************************/

            ResultSet rs = null;

            sql = "SELECT Price FROM GasPrice WHERE GasType = 'Diesel';";
            stmt.execute(sql);
            // String gasType = rs.getString(1);
            // double price = rs.getDouble(2);
            // rs.close();


        } catch (SQLException e) {

            if (e.getErrorCode() == 1007) {
                System.err.println("Database Already Exists");
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
