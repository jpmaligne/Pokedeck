/**
 * 
 * This class correspond with each Card the player have to play to get the needed ressources so his pokemon can attack.
 * Name of Energy Cards will always be "Energy".
 */
public class EnergyCard extends Card{
	private Energy Energy;
	public EnergyCard(Energy anEnergy) {
		super("Energy");
		Energy = anEnergy;
	}

	public Energy getEnergy(){
		return Energy;
	}
}
