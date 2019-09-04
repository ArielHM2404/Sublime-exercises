// 7.11: DeckOfCardsTest.java
//Card shuffling and dealing.

public class DeckOfCardsTest
{
	//Execute application
	public static void main(String[] args) 
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();

		//Print all 52 Cards in the order in which they are dealt
		for (int i= 1; i < 52; i++) 
		{
			//Deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0)  //output a new line every fourth card
				System.out.println();
				
		}


	}
}