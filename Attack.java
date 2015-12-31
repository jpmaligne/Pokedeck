import java.util.ArrayList;
/**
 * 
 * I put two constructors on this class because some attacks will have a description and bonusDommages if a condition is respected
 * and some others won't have this description neither bonusDommages.
 * In the same way that each pokemon have a List of Attacks, each Attack have a list of Energy (from the Energy Class) that the player need to
 * activate before his pokemon can use this Attack.
 */
public class Attack {
	private ArrayList<Energy> Ressources;
	private String Name;
	private int Dommages;
	private int BonusDommages;
	private String Description;
	
	/**
	 * 
	 * @param SomeRessources
	 * @param aName
	 * @param SomeDommages
	 */
	public Attack(ArrayList<Energy> SomeRessources, String aName, int SomeDommages){
		Ressources = SomeRessources;
		Name = aName;
		Dommages = SomeDommages;
	}
	
	
	/**
	 * 
	 * @param SomeRessources
	 * @param aName
	 * @param SomeDommages
	 * @param aDescription
	 * @param SomeBonusDommages
	 */
	public Attack(ArrayList<Energy> SomeRessources, String aName, int SomeDommages, String aDescription, int SomeBonusDommages){
		Ressources = SomeRessources;
		Name = aName;
		Dommages = SomeDommages;
		Description = aDescription;
		BonusDommages = SomeBonusDommages;
	}
	
	
	public ArrayList<Energy> getRessources(){
		return Ressources;
	}
	public String getName(){
		return Name;
	}
	public int getDommages(){
		return Dommages;
	}
	public String getDescription(){
		return Description;
	}
	public int getBonusDommages(){
		return BonusDommages;
	}
}
