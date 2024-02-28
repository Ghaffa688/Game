package game.engine.titans;

public class PureTitan extends Titan {

	public int TITAN_CODE () {
		return 1;
	}
	
	public PureTitan (int baseHealth, int baseDamage, int heightInMeters, 
	int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		super (baseHealth, baseDamage, heightInMeters, 
		distanceFromBase, speed, resourcesValue, dangerLevel);
	}

	@Override
	public int compareTo (Object o) {
	PureTitan x = (PureTitan) o;
	return this.distanceFromBase - x.distanceFromBase;
	}
}
