package ch4;

import java.util.HashMap;
import java.util.Map;

public class CardDescription {
	private static Map<String, String> CardValue = new HashMap<String,String>();
	private static Map<String, String> Suit = new HashMap<String,String>();
	private String shortHand;
	
	public CardDescription(String input) {
		InitializeCards();
		shortHand = input;

	}
		
	public void InitializeCards() {
		
		CardValue.put("2", "Two");
		CardValue.put("3", "Three");
		CardValue.put("4", "Four");
		CardValue.put("5", "Five");
		CardValue.put("6", "Six");
		CardValue.put("7", "Seven");
		CardValue.put("8", "Eight");
		CardValue.put("9", "Nine");
		CardValue.put("10", "Ten");
		CardValue.put("A", "Ace");
		CardValue.put("J", "Jacks");
		CardValue.put("Q", "Queen");
		CardValue.put("K", "King");
		
		Suit.put("C", "Clubs");
		Suit.put("D", "Diamonds");
		Suit.put("H", "Hearts");
		Suit.put("S", "Spades");		
	}
	
	public String getDescription() { 
		String value = shortHand.substring(0,1);
		String suit = shortHand.substring(1,2);
		String description = "Unknown"; 
		if (CardValue.containsKey(value) && Suit.containsKey(suit)) { 
			description = String.format("%s of %s", 
					CardValue.get(value), 
					Suit.get(suit)); 
		}
		return description;
	} 

}
