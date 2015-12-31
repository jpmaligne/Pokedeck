import java.util.ArrayList;

public class Pokedeck {

	public static void main(String[] args) {
		// I'm creating Charmander.
		
		Energy fire = new Energy("fire");
		Energy all = new Energy("all");
		Energy water = new Energy("water");
		
		//His first Attack is Scratch
		ArrayList<Energy> ScratchRessource= new ArrayList<Energy>();
		ScratchRessource.add(all);
		Attack Scratch = new Attack(ScratchRessource,"Scratch",10);
		
		//His second Attack is Ember
		ArrayList<Energy> EmberRessource= new ArrayList<Energy>();
		EmberRessource.add(all);
		EmberRessource.add(fire);
		String EmberDescription = "Discard a Fire Energy card attached to Charmander in order to use this attack";
		Attack Ember = new Attack(EmberRessource,"Ember",30,EmberDescription,0);
		
		ArrayList<Attack> CharmanderAttacks = new ArrayList<Attack>();
		CharmanderAttacks.add(Scratch);
		CharmanderAttacks.add(Ember);
		Pokemon CharmanderPet = new Pokemon(fire,50,0,null,CharmanderAttacks, water, null, all);
									  //(Type,HP,Stage,Evolution,ListAttack,Weakness,Resistance,RetreatCost)
		
		//Creating his Card.
		PokemonCard Charmander = new PokemonCard("Charmander", CharmanderPet, 46, 0);
											//(String aName,Pokemon aPet, int aCollectorCardNumber, int anExpansionSymbol) 
	}

}
