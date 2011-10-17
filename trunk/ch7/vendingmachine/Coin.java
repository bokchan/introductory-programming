package ch7.vendingmachine;


public class Coin {
	private float value;
	private String name;
		
	/**
	 * Public constructor
	 * 
	 * @param aValue value of the cointype
	 * @param aName name of the cointype
	 */
	public Coin(float aValue, String aName) {
		this.value = aValue;
		this.name = aName;
	}
	
	/**
	 * 
	 * @return value of the coin
	 */
	public float getValue() {
		return this.value;
	}

	/**
	 * 
	 * @return name of the coin
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("%s: $%s",name, value);
	}
	
}