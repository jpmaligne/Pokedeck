/**
 * 
 * Class TrainerType can return ITEM; SUPPORTER; or STADIUM
 *
 */
public abstract class TrainerType {
	private String Type;

	public TrainerType(String aType){
		Type = aType;
	}

	public String getTrainerType(){
		return Type;
	}
}
