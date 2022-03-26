import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  // 1. Create the following classes. Card, Deck, Player
  // Deck has field: cards - list of card

  private List<Card> cards = new ArrayList<Card>();

  // Constructor: when new Deck is instantiated, the Cards field should be populated with the
  // standard 52 cards
  public Deck(List<Card> cards) {
    this.cards = cards;
  }

  // Methods: shuffle - randomize the order of the cards
  //          draw - removes and returns the top card of the cards field

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    Card card = cards.get(0);
    cards.remove(card);
    return card;
  }

}
