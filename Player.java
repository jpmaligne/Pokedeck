import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Player(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	


	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void drawCard(Card aCard){
		deck.add(aCard);
	}
}
