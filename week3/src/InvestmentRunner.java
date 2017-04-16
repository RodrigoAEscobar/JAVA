/**
   This program computes how long it takes for an investment
   to double.
*/
public class InvestmentRunner
{
   public static void main(String[] args)
   {
      final double INITIAL_BALANCE = 10000;
      final double RATE = 5;
      Investment invest = new Investment(INITIAL_BALANCE, RATE);
      invest.waitForBalance(10 * INITIAL_BALANCE);
      int years = invest.getYears();
      System.out.println("The investment 10X after "
            + years + " years");
   }   
}
