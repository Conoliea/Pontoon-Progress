package PontoonOOP;
import java.util.ArrayList;

public class Deck 
{
	private ArrayList<Card> cards;// class instance
	
	public Deck()//constructor
	{
		this.cards = new ArrayList<Card>();
	}
	
	public void deckStack()//creates the cards
	{
		for(Suit cardSuit : Suit.values())
		{
			for(Value cardValue : Value.values())
			{
				this.cards.add(new Card(cardSuit, cardValue));//adds a new card to the hand
			}
		}
	}
}
