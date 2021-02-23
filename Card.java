package war;

public class Card {

	/*
	 * A.
	 * 1 & 2.
	 * 1.	value (contains a value from 2-14 representing cards 2-Ace)
	 * 2.	name (e.g. Ace of Diamonds, or Two of Hearts)

	 * 
	 */
	
	// Save value that will hold the card number
	private int value;
	// How string that will hold the suit.
	private String name;
	
	
	// Create a switch block to assign a string to a case value, Creating our cards.
	public Card(int x, String suit) {
		
		value = x;
		
		
		switch(x) {
        case 2: name = "Two";
            break;
        case 3: name = "Three";
            break;
        case 4: name = "Four";
            break;
        case 5: name = "Five";
            break;
        case 6: name = "Six";
            break;
        case 7: name = "Seven";
            break;
        case 8: name = "Eight";
            break;
        case 9: name = "Nine";
            break;
        case 10: name = "Ten";
            break;
        case 11: name = "Jack";
            break;
        case 12: name = "Queen";
            break;
        case 13: name = "King";
            break;
        case 14: name = "Ace";
            break;
		
		
		}
		// This will add name and suit with of in the middle.
		name += " of " + suit;
		
	}
	
	/*
	 * ii.	Methods
	 * 1.	Getters and Setters
	 * 2.	describe (prints out information about a card)
	 */
	
	
	
	// This will print the card
	public void describe() {
		//Print card.
		System.out.println("Card: " + name);
	}
	
	
	// Getters, and Setters.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
