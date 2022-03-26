
public class Card {
  // 1. Create the following classes. Card, Deck, Player
  // Card has fields: value - contains a value 2-14 representing cards 2-Ace
  //                  name - e.g. Ace of Diamonds, or Two of Hearts

  private int value;
  private String name;

  // Methods: getters & setters
  //          describe - prints info about the card


  public void describe() {
    System.out.println("Card: " + name + " Value: " + value);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
