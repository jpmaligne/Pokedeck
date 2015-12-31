public class PokemonCard extends Card{
	private Pokemon Pet;
	private int CollectorCardNumber;
	private int ExpansionSymbol;
	public PokemonCard(String aName,Pokemon aPet, int aCollectorCardNumber, int anExpansionSymbol) {
		super(aName);
		Pet = aPet;
		CollectorCardNumber = aCollectorCardNumber;
		ExpansionSymbol = anExpansionSymbol;
	}
	
	public Pokemon getPokemon(){
		return Pet;
	}
	public int getCollectorCardNumber(){
		return CollectorCardNumber;
	}
	public int getExpansionSymbol(){
		return ExpansionSymbol;
	}
}
