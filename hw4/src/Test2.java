import java.util.Scanner;
import java.io.IOException;

/**
 * This program prompts the user to enter a file name with account information. A bank object is filled with the account numbers and balances specified in the
 * file. In case of an exception, the user can choose another file.
 */
public class Test2 {
	public static void main(String[] args) {
		boolean done = false;
		Scanner in = new Scanner(System.in);
		Bank bank = new Bank();

		while (!done) {
			System.out.print("Filename: ");
			String filename = in.next();

			try {
				bank.readFile(filename);
				// highest balance account
				BankAccount highest = bank.getHighestBalance();
				//TODO System.out.println(highest.getAccountNumber() + " " + highest.getBalance());
				// lowest balance account
				BankAccount lowest = bank.getLowestBalance();
				//TODO System.out.println(lowest.getAccountNumber() + " " + lowest.getBalance());
				// lowest balance account
				double totalBalances = bank.getTotalBalances();
				System.out.println("Total of all balances = " + totalBalances);
				done = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
