package game.engine.titans;

public class AbnormalTitan extends Titan {
	
	public int TITAN_CODE () {
		return 2;
	}

	public AbnormalTitan (int baseHealth, int baseDamage, int heightInMeters, 
	int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		super (baseHealth, baseDamage, heightInMeters, 
		distanceFromBase, speed, resourcesValue, dangerLevel);
	}
	
	@Override
	public int compareTo (Object o) {
	AbnormalTitan x = (AbnormalTitan) o;
	return this.distanceFromBase - x.distanceFromBase;
	}
	
}
