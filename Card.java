package PontoonOOP;

public class Card 
{
	private Suit suit;
	private Value value;
	
	public void card (Suit suit, Value value)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public Value getValue()
	{
		return this.value;
	}
}