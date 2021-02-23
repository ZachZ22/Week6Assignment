package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	/*
	 * i. Fields 
	 * 1. Hand
	 */
	// Create a List of Card and hold values in ArrayList
    private List<Card> hand = new ArrayList<Card>();
   /*
    * 2. Score(set to 0 in the constructor)
    */
    
    // Save score
    private int score;
    // Save Name
    private String name;
    // Create a constructor that will set player scores to zero
    public Player() {
        score = 0;
    }

    //Create a constructor that will take a string.
    
    /*
     * i Fields
     * 3.name
     */
    public Player(String newName) {
    	// set strings "Player" score to zero
    	score = 0;
    	// set String Name of player.
    	name = newName;        
    }
    
    /*
     * 1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
     */
    // Create a method that will describe the card
    public void describe() {
    	//Print name
        System.out.print(name);
        // Enhanced for loop that will loop through the cards in hand
        for (Card card : hand) {
        	//Will card.describle method to get what card it is.
            card.describe();
        }
    }
    
    /*
     * 2.	flip (removes and returns the top card of the Hand)
     */
    // Create method flip
    public Card flip() {
    	// Removes and returns the top card of the hand by removing hand at index 0
        return hand.remove(0);
    }
    
    /*
     * 3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
     */
    // Create method to draw
    public void draw(Deck deck) {
    	// Add a card by calling the deck.draw.
        hand.add(deck.draw());
    }
    /*
     * 4.	incrementScore (adds 1 to the Player’s score field)
     */
    // Create a method to incrementScore.
    public void incrementScore() {
    	// score is ++
        score++;
    }
    // Create a method to getScore.
    public int getScore() {
    	// Return score.
        return score;
    }

}

