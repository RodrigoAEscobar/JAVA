/*
 * File: CashRegister.java
 * Project: CSIS 3100 hw1
 * Company: Nova Southeastern University
 * Supervisor: Professor Alvaro Escobar
 * Author: Rodrigo Escobar
 * History: Created May 27 2013
 * Assisted by: None
 * References: Book: Big Java, 4th edition; Horstmann
 *
 * (c) Copyright Rodrigo Escobar 2013 All rights reserved.
 * 
 * Modify CashRegister class so it gives back change in $/Q/D/N/P.  
 * Modify CashRegisterTest class so it asks the user, from the console prompt, for:
 * 
 * 2 tax-free purchases, 
 * 2 taxable purchases and 
 * a payment amount in $/Q/D/N/P in that order.  
 * 
 * The output will be how much change to give back, specified in $/Q/D/N/P 
 * like the VendingMachine class sample covered in class.
 * Make sure you create the project hw1 in Eclipse and when done zip up the ENTIRE folder.  
 * Submit in here the zip of your project.  
 * Late assignments will not be accepted.
 * 
 * $/Q/D/N/P = Dollars/Quarters/Dimes/Nickles/Pennies.
 *
 */
package hw1;

/**
 * @author Rodrigo Escobar
 * 
 */
public class CashRegister {
	/**
	 * Money variables
	 */
	public static final double DOLLAR = 1.0;
	public static final double QUARTER = 0.25;
	public static final double DIME = 0.1;
	public static final double NIKEL = 0.05;
	public static final double PENNY = 0.01;

	/**
	 * Transaction Variables
	 */
	private double purchase;
	private double payment;
	private double taxablePurchase;
	private double taxRate;
	private double changeDue;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister(double rate) {
		this.purchase = 0;
		this.payment = 0;
		this.taxRate = rate;
	}

	/**
	 * Records the sale of an item.
	 * 
	 * @param amount - the price of the item
	 */
	public void recordPurchase(double purchase) {
		this.purchase += purchase;
	}

	/**
	 * Records the sale of a taxable item.
	 * 
	 * @param amount - the price of the item
	 */
	public void recordTaxablePurchase(double amount) {
		taxablePurchase = taxablePurchase + amount;
	}

	/**
	 * Processes the sales tax due.
	 * 
	 * @return the sales tax due
	 */
	public double getSalesTax() {
		return taxablePurchase * taxRate / 100;
	}

	/**
	 * Processes the payment received from the customer.
	 * 
	 * @param dollars
	 *            the number of dollars in the payment
	 * @param quarters
	 *            the number of quarters in the payment
	 * @param dimes
	 *            the number of dimes in the payment
	 * @param nickels
	 *            the number of nickels in the payment
	 * @param pennies
	 *            the number of pennies in the payment
	 */
	public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
		this.payment = dollars + quarters * QUARTER + dimes * DIME + nickels * NIKEL + pennies * PENNY;
	}

	public double getPurchase() {
		return purchase;
	}

	public double getPayment() {
		return payment;
	}

	public double getTaxablePurchase() {
		return taxablePurchase;
	}

	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * Computes the change due and resets the machine for the next customer.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange() {
		this.changeDue = this.payment - this.purchase - this.taxablePurchase - getSalesTax();
		this.changeDue = changeDue;
		return changeDue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "register:[" + getPayment() + "," + getPurchase() + "," + getTaxablePurchase() + "," + getTaxRate()
				+ "]";
	}
}
