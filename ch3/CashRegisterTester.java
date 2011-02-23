package ch3;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(20.37);
      register.recordPurchase(1.37);
      register.enterDollars(34);
      register.enterQuarters(2);
      double change = register.giveChange();

      System.out.println("Change:" + change);      
      System.out.printf("%s number  of items", register.getItemCount());
   }
}
