import java.util.ArrayList;
import java.util.List;

public class App {
  // 2. Create a class called App with a main method.
  
  public static void main(String[] args) {
    
    // 3. Instantiate a deck and two players. call the shuffle method on the deck;
    
    Deck deck = new Deck(createStandardCards());
    Player player1 = new Player("Bob");
    Player player2 = new Player("Sally");

    deck.shuffle();

    // 4. Using a traditional for loop, iterate 52 times calling the Draw method on the other player
    // each iteration
    // using the Deck you instantiated.
    
    for (int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
        player1.draw(deck);
      } else {
        player2.draw(deck);
      }
    }

    // 5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
    
    for (int i = 0; i < 26; i++) {
      Card player1Card = player1.flip();
      Card player2Card = player2.flip();

      // a. Compare the value of each card returned by the two player's flip method. Call the
      // incrementScore method on the player whose card has the higher value.
      if (player1Card.getValue() > player2Card.getValue()) {
        player1.incrementScore();
      } else if (player2Card.getValue() > player1Card.getValue()) {
        player2.incrementScore();
      } else if (player2Card.getValue() == player1Card.getValue()) {
        player1.incrementScore();
        player2.incrementScore();
      }

    }

    // 6. After the loop, compare the final score from each player.
    // 7. Print the final score of each player, and either "Player 1", "Player 2", or "Draw"
    // depending on which score is higher or if they are both the same.
    
    System.out.println(player1.getName() + " " + player1.getScore());
    System.out.println(player2.getName() + " " + player2.getScore());


    if (player1.getScore() > player2.getScore()) {
      System.out.println("Player 1: " + player1.getName() + " WINS!");
    } else if (player2.getScore() > player1.getScore()) {
      System.out.println("Player 2: " +player2.getName() + " WINS!");
    } else if (player1.getScore() == player2.getScore()) {
      System.out.println("DRAW.");
    }
  }

  
  public static List<Card> createStandardCards() {
    
    List<Card> cards = new ArrayList<Card>();
    String[] types = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    for (String type : types) {
      for (int value = 2; value <= 14; value++) {
        Card card = new Card();
        card.setName(type);
        card.setValue(value);
        
        if (value == 11) {
          card.setName("Jack of  " + type);
        } else if (value == 12) {
          card.setName("Queen of " + type);
        } else if (value == 13) {
          card.setName("King of " + type);
        } else if (value == 14) {
          card.setName("Ace of " + type);
        } else {
          card.setName(value + " of " + type);
        }
        cards.add(card);
      }
    }
    return cards;
  }

}
