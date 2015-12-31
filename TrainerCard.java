/**
 * 
 * The TrainerCard is a Card with specifics attributes
 *
 */
public class TrainerCard extends Card{
	private TrainerType TrainerType;
	private String Description;
	private String Rules;
	
	public TrainerCard(String aName, TrainerType aTrainerType, String aDescription, String someRules) {
		super(aName);
		TrainerType = aTrainerType;
		Description = aDescription;
		Rules = someRules;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public TrainerType getType(){
		return TrainerType;
	}
	public String getDescription(){
		return Description;
	}
	public String Rules(){
		return Rules;
	}
}
