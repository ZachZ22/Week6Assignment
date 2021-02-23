package war;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	/*
	 * b.	Deck
	 * 
	 * i.	Fields
	 * 1.	cards (List of Card)
	 *
	 * ii.	Methods
	 * 1.	shuffle (randomizes the order of the cards)
	 * 2.	draw (removes and returns the top card of the Cards field)
	 * 
	 */
	
	// Create a new List of Card and store it in and ArrayList
	List<Card> cards = new ArrayList<Card>();
	//Create a List of String, That will hold suits in and Array as list.
	List<String> suits = Arrays.asList("Spades" , "Diamonds" , "Hearts" , "Clubs");
	
	
	
	
	// Create a method that will create a deck
	public Deck() {
		// For loop that will go through 2-15
		for (int i =2; i < 15; i++) {
			//Nested for loop that will iterate 2-15 and go through the suit in suits
			for (String suit : suits) {
				// This will add to cards a value x and a suit.
				cards.add(new Card(i,suit));
			}
					
			
		}
	}
	/*
	 * ii. Methods
	 * 1. Shuffle
	 */
	// Create a method to shuffle cards. 
	public void shuffle() {
		// This will use the java collections .shuffle to randomly rearrange our List
		Collections.shuffle(cards);
		
	}
	
	/*
	 * ii. Methods
	 * 2. Draw
	 */
	
	//Create a method to draw a card. 
	public Card draw() {
		//Return card.
		return cards.remove(0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
