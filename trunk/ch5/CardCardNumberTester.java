package ch5;

import javax.swing.JOptionPane;

public class CardCardNumberTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cardCardNumber = JOptionPane.showInputDialog("Input an 8 digit creditcard number");
//		while (cardCardNumber.length() > 8|| cardCardNumber.length() < 8) {
//			JOptionPane.showInputDialog("Input an 8 digit creditcard number");
//		} 
		CreditCardNumberCheck ccnc = new CreditCardNumberCheck(Integer.parseInt(cardCardNumber));
		
		if (!ccnc.checkCardCardNumber()) {
			
			System.out.println("CreditCardNumber is not valid");
			System.out.printf("Check digit %s is invalid", ccnc.getCheckDigit());
		} else {
			System.out.println("CreditCardNumber is valid");
		}
	}

}
