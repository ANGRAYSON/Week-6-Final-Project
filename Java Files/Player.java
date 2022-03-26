import java.util.ArrayList;
import java.util.List;

public class Player {
  // 1. Create the following classes. Card, Deck, Player

  // Players has fields: hand - list of card
  //                     score - set to 0 in the constructor
  //                     name

  private List<Card> hand = new ArrayList<Card>();
  private int score;
  private String name;

  public Player(String name) {
    this.name = name;
    score = 0;

  }

  // Methods: describe - prints out info about the player, calls describe for each card in hand
  //          flip - removes and returns the top card of the hand
  //          draw - takes a deck as an argument and calls the draw method on deck, adding returned card to
  //          hand field
  //          incrementScore - adds 1 to the players score

  public void describe() {
    System.out.println("Name: " + name);
    for (Card card : hand) {
      System.out.println(card.getName());
    }
  }

  public Card flip() {
    Card card = hand.get(0);
    hand.remove(card);
    return card;
  }

  public void draw(Deck deck) {
    Card card = deck.draw();
    hand.add(card);
  }

  public void incrementScore() {
    score++;
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }

}
