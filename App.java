package war;
/*
 * 2.	Create a class called App with a main method.
 */
public class App {

	public static void main(String[] args) {
	

        /*
         * 3.	Instantiate a Deck and two Players, call the shuffle method on the deck
         */
		
		// Create a new deck of class Deck
        Deck deck = new Deck();
        // Create a new player of class Player, assign it the value of player 1
        Player player1 = new Player("player 1 draws: \n");
        // Create a new player of class Player, assign it the value of player 2
        Player player2 = new Player("player 2 draws \n");
        // Shuffle the deck before playing
        deck.shuffle();

        /*
         * 4.	Using a traditional for loop, iterate 52 times 
         * calling the Draw method on the other player each iteration 
         * using the Deck you instantiated.
         */
        
        //Create a for loop that will loop through the deck
        for (int i = 0; i < 52; i++) {
        	// If even player one draws a card
            if ( i % 2 == 0) {
            	//player one draws card
                player1.draw(deck);
              // if odd player two draws card
            } else {
            	//player two draws card
                player2.draw(deck);
                
            }
        }
        // Call describe from Player for player1
        player1.describe();
        // Call describe from Player for player2
        player2.describe();
        
        
        /*
         * 5.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
         * a.	Compare the value of each card returned by the two player’s flip methods. Call 
         * 		the incrementScore method on the player whose card has the higher value.
         */
        
        
        /* Create a for loop what will go through half the deck,
         *  return flip from player,
         *   get the value and increase score if on flip is higher then the other.
        */
        for (int i = 0; i < 26; i++) {
        	
        	// Player 1 will flip each iteration
            Card player1Card = player1.flip();
            // player 2 will flip each iteration
            Card player2Card = player2.flip();
            // if player 1 card value is higher then player 2 then increment player1 score
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
             // if player 2 card value is higher then player 1 then increment player2 score
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            }
        }

       /*
        * 6.	After the loop, compare the final score from each player. 
        */
        
        // If player one's score is greater then print player one wins.
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player1 wins.");
        // If player two's score is greater then print player two wins.
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player2 wins.");
        //if player one and player two scores are the same then print draw
        } else {
            System.out.println("Draw.");
        }

        
     /*
      * 7.	Print the final score of each player and either “Player 1”, “Player 2”,
      *  or “Draw” depending on which score is higher or if they are both the same.
      */
        
        // Print Player1 score.
        System.out.printf("Player1 score = %d\n", player1.getScore());
        // print Player2 score.
        System.out.printf("Player2 score = %d\n", player2.getScore());
        
        
        
	}

}
