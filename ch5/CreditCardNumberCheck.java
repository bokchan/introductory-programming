package ch5;


public class CreditCardNumberCheck {
	private int sumRightMostDigits = 0;
	private int everyOtherDigit = 0;
	private int[] iArray; 

	public CreditCardNumberCheck(int creditCardNumber) {
		String s = String.valueOf(creditCardNumber);
		char[] cArray = s.toCharArray();
		iArray = new int[cArray.length];
		for (int i = 0; i < cArray.length; i++ ) {
			iArray[i]  = Integer.valueOf(String.valueOf(cArray[i]));
		} 
		
		rightmostDigits();
		everyOtherDigit();
	}

	private void rightmostDigits() {

		for (int i = iArray.length -1; i >=0; i-= 2) {
			sumRightMostDigits +=  iArray[i]; 
		}	
	}

	private void everyOtherDigit() {
		for (int i = iArray.length -2; i >=0; i-= 2) {
			everyOtherDigit +=  iArray[i]; 
		}	 
	}  

	private boolean isValid() {
		if ((sumRightMostDigits + everyOtherDigit) % 10 ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkCardCardNumber() {
		return isValid();
	} 
	
	public int getCheckDigit() {
		return iArray[iArray.length-1];
	}
}

