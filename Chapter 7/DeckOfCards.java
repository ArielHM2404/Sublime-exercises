// 7.10: DeckOfCard.java
//DeckOfCards class represents a deck of playing cards
import java.security.SecureRandom;

public class DeckOfCards 
{
	private Card[] deck; //array of Card object
	private int currentCard; //index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52; //constant # of Cards
	//random number generaton
	private static final SecureRandom randomNumbers = new SecureRandom();

	//Constructor fills deck of Cards
	public DeckOfCards()
	{
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
		 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		 String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		 deck = new Card[NUMBER_OF_CARDS]; //create array of Card object
		 currentCard = 0; //first card dealt will be deck[0]

		 //Populate deck with Card objects
		 for (int count = 0; count < deck.length; count++)
		 	deck[count] =
		 new Card(faces[count % 13], suits[count / 13]);
	}

	//Shuffle deck of Cards with one-pass algorithm
	public void shuffle()
	{
		//Next call to method dealCard should start at deck[0] again
		currentCard = 0;

		//For each Card, pick another random Card (0-51) and swap them
		for (int first = 0; first <deck.length; first++)
		{
			//Select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			//Swap current Card with randomly selected Cards
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	//Deal one Card
	public Card dealCard() 
	{
		//Determine whether Cards remain to be dealt
		if (currentCard < deck.length)
			return deck[currentCard++]; //return current Card in the array
		else
			return null; //Return null to indicate that all Cards were dealt
	}
}