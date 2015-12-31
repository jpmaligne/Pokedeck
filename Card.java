public class Card {
	private String Name;

	
	public Card(String aName){
		this.Name = aName;
	}

	public String getName() {
		return Name;
	}

	
	public String toString(){
		return "Name: "+this.Name;
	}
}
