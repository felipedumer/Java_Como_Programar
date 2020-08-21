package cap16;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// classe para representar uma Card de um baralho
class Card
{
	public static enum Face {Ace, Deuce, Three, Four, Five, Six,
		Seven, Eight, Nine, Ten, Jack, Queen, King };
	public static enum Suit {Clubs, Diamonds, Hearts, Spades};
	
	private final Face face;
	private final Suit suit;

	// construtor
	public Card(Face face, Suit suit)
	{
		this.face = face;
		this.suit = suit;
	}
	
	// retorna face da carta
	public Face getFace()
	{
		return face;
	}
	
	// retorna naipe de Card
	public Suit getSuit()
	{
		return suit;
	}
	
	// retorna representa��o String de Card
	@Override
	public String toString()
	{
		return String.format("%s of %s", face, suit);
	}
	
} // fim da classe Card

// declara��o da classe DeckOfCards
public class DeckOfCards 
{
	private List<Card> list; // declara List que armazenar� Cards
	
	// configura baralho de Cards e embaralha
	public DeckOfCards()
	{
		Card[] deck = new Card[52];
		int count = 0; // n�mero de cartas
		
		// preenche baralho com objetos Card
		for (Card.Suit suit: Card.Suit.values())
		{
			for (Card.Face face: Card.Face.values())
			{
				deck[count] = new Card(face, suit);
				++count;
			}
		}
		
		list = Arrays.asList(deck); // obt�m List
		Collections.shuffle(list); // embaralha as cartas
	} // fim do construtor DeckOfCards
	
	// gera sa�da de baralho
	public void printCards()
	{
		// exibe 52 cartas em duas colunas
		for (int i = 0; i < list.size(); i++)
		{
			System.out.printf("%-19s", list.get(i));
			System.out.printf(((i + 1) % 4 == 0) ? "%n" : "");
		}
	}
	
	public static void main(String[] args) 
	{
		DeckOfCards cards = new DeckOfCards();
		cards.printCards();
	}
}
