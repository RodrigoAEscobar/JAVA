import java.io.IOException;

/**
 * A bank contains account numbers and balances of each customer.
 */
public class Bank {

	/**
	 * Construct a Bank object.
	 */
	public Bank() {
		// TODO accountList
	}

	/**
	 * Read a file with account numbers and balances and adds the accounts to the bank.
	 * 
	 * @param filename
	 *            the name of the file
	 */
	public void readFile(String filename) throws IOException {
		// TODO read a file
	}

	/**
	 * Add an account to the bank.
	 * 
	 * @param b
	 *            the BankAccount reference
	 */
	public void addAccount(BankAccount b) {
		// TODO add the account b to the accountList
	}

	/**
	 * Gets the account with the highest balance.
	 * 
	 * @return the account with the highest balance
	 */
	public BankAccount getHighestBalance() {
		// TODO return account with highest balance
		return null;
	}
	
	/**
	 * Gets the account with the lowest balance.
	 * 
	 * @return the account with the lowest balance
	 */
	public BankAccount getLowestBalance() {
		// TODO return account with lowest balance
		return null;
	}
	
	/**
	 * Gets the account with the lowest balance.
	 * 
	 * @return the account with the lowest balance
	 */
	public double getTotalBalances() {
		// TODO return total of all balances
		return 0.0;
	}
}
