//7.9: Card.java.
//Card class represents a playing card

public class Card
{
	private final String face; //face of card("Ace", "Deuce",...)
	private final String suit; //suit of card("Hearts", "Diamonds",...)

	//Two-argument constructor initializes card's face and suit
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace; //initializing face of card
		this.suit = cardSuit; //initializing face of suit
	}

	//Return String representation of Card
	public String toString()
	{
		return face + " of " + suit;
	}
}