package ch7;


public class Coin {
	private double value;
	private String name;
		
	/**
	 * Public constructor
	 * 
	 * @param aValue value of the cointype
	 * @param aName name of the cointype
	 */
	public Coin(double aValue, String aName) {
		this.value = aValue;
		this.name = aName;
	}
	
	/**
	 * 
	 * @return value of the coin
	 */
	public double getValue() {
		return this.value;
	}

	/**
	 * 
	 * @return name of the coin
	 */
	public String getName() {
		return name;
	}

}