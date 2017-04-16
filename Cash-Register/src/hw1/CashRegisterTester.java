package hw1;
import java.util.Scanner;

/*
 * File: CashRegisterTester.java
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

/**
 * @author the-beast
 * 
 */
public class CashRegisterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final double taxRate = 6.5;
		CashRegister register = new CashRegister(taxRate);

		System.out.print("Please enter the first tax free purchase: ");
		double firstTaxFreePurchase = in.nextDouble();
		register.recordPurchase(firstTaxFreePurchase);

		System.out.print("Please enter the seccond tax free purchase: ");
		double secondTaxFreePurchase = in.nextDouble();
		register.recordPurchase(secondTaxFreePurchase);

		System.out.print("Please enter the first taxable purchase: ");
		double firstTaxablePurchase = in.nextDouble();
		register.recordTaxablePurchase(firstTaxablePurchase);

		System.out.print("Please enter the second taxable purchase: ");
		double secondTaxablePurchase = in.nextDouble();
		register.recordTaxablePurchase(secondTaxablePurchase);

		/**
		 * Prompt user for Payment info
		 */
		System.out.print("Enter the number of Dollars of the payment: ");
		int dollars = in.nextInt();
		System.out.print("Enter the number of Quarters of the payment: ");
		int quarter = in.nextInt();
		System.out.print("Enter the number of Dimes of the payment: ");
		int dime = in.nextInt();
		System.out.print("Enter the number of Nickels of the payment: ");
		int nickel = in.nextInt();
		System.out.print("Enter the number of Pennies of the payment: ");
		int penny = in.nextInt();

		register.receivePayment(dollars, quarter, dime, nickel, penny);

		/**
		 * Compute and print change Due
		 */
		System.out.println("Change: ");

		double changeDue = register.giveChange();

		// Compute change due

		double dollar = changeDue / CashRegister.DOLLAR;
		changeDue = changeDue % (CashRegister.DOLLAR);
		double quarters = changeDue / CashRegister.QUARTER * CashRegister.DOLLAR;
		changeDue = changeDue % CashRegister.QUARTER;
		double dimes = changeDue / CashRegister.DIME * CashRegister.DOLLAR;
		changeDue = changeDue % CashRegister.DIME;
		double nikels = changeDue / CashRegister.NIKEL * CashRegister.DOLLAR;
		changeDue = changeDue % CashRegister.NIKEL;
		double pennies = changeDue / CashRegister.PENNY * CashRegister.DOLLAR;
		changeDue = changeDue % CashRegister.PENNY;

		// Print change due

		System.out.printf("Dollars:     " + dollar);
		System.out.println();
		System.out.printf("Quarters:    " + quarters);
		System.out.println();
		System.out.printf("Dimes:       " + dimes);
		System.out.println();
		System.out.printf("Nikels:      " + nikels);
		System.out.println();
		System.out.printf("Pennies:     " + pennies);
		System.out.println();

	}

}
