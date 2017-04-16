import java.util.Scanner;
/**
 * This class tests the PrimeGenerator class.
 * written by Duaa Almubasher
 * written in 5/28/2013
 */

public class PrimeTester {

   public static void main(String[] args)
   {
	  Scanner in = new Scanner(System.in);
	  PrimeGenerator prime = new PrimeGenerator();
      
      System.out.print("Enter an integer: ");
      int num = in.nextInt();
		prime.nextPrime(num);
      
   }
}

