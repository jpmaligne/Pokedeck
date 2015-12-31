import java.util.ArrayList;

/**
 * 
 * Here Attacks are a list of attacks from the class Attack
 * and Type is from Energy class
 */
public class Pokemon{
	private Energy Type;
	private int HP;
	private int Stage;
	private Pokemon Evolution; 			//Pokemon Type
	private ArrayList<Attack> Attacks;
	private Energy Weakness;
	private Energy Resistance;
	private Energy RetreatCost;

	/**
	 * Constructor
	 * @param aType
	 * @param anHP
	 * @param aStage
	 * @param anEvolution
	 * @param SomeAttacks
	 */
	public Pokemon(Energy aType, int anHP, int aStage, Pokemon anEvolution, ArrayList<Attack>SomeAttacks, Energy aWeakness, Energy aResistance, Energy aRetreatCost) {
		Type = aType;
		HP = anHP;
		Stage = aStage;
		Evolution = anEvolution;
		Attacks = SomeAttacks;
		Weakness = aWeakness;
		Resistance = aResistance;
		RetreatCost = aRetreatCost;
	}
	public void HPLoose(int dmg){
		HP -= dmg;
	}
	
	
	public Energy getType(){
		return Type;
	}
	public int getHP(){
		return HP;
	}
	public int getStage(){
		return Stage;
	}
	public Pokemon getEvolution(){
		return Evolution;
	}
	public ArrayList<Attack> getAttacks(){
		return Attacks;
	}
	public Energy getWeakness(){
		return Weakness;
	}
	public Energy getResistance(){
		return Resistance;
	}
	public Energy getRetreatCost(){
		return RetreatCost;
	}	
}
