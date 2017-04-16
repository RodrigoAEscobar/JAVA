package fleetgastracker;
import java.sql.SQLException;
import java.util.Scanner;

import fleetgastracker.DataSourcesSingleton;
import fleetgastracker.SubMenus;

public class Driver {

    /**
     * @throws SQLException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws SQLException,
            InterruptedException {

        DataSourcesSingleton.createDatabase();

        boolean exit = false;

        do {
            System.out.println("1.Manage Vehicles");
            System.out.println("2.Manage Fleets");
            System.out.println("3.Manage Transactions");
            System.out.println("4.exit");
            Scanner sd = new Scanner(System.in);
            System.out.println("Please enter your choice: ");
            int num = sd.nextInt();
            switch (num) {
            case 1:
                SubMenus.one();
                break;

            case 2:

                System.out.println("This option is not available yet");
                System.out.println("\n");
                Thread.sleep(2000);
                break;

            case 3:

                System.out.println("This option is not available yet");
                System.out.println("\n");
                Thread.sleep(2000);
                break;

            case 4:
                System.out.println("Good Bye!");
                exit = true;
                break;
            }
        } while (!exit);
    }
}
