package game.engine.titans;

public class ArmoredTitan extends Titan {
	
	public int TITAN_CODE () {
		return 3;
	}
	
	public ArmoredTitan (int baseHealth, int baseDamage, int heightInMeters, 
	int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		super (baseHealth, baseDamage, heightInMeters, 
		distanceFromBase, speed, resourcesValue, dangerLevel);
	}

	@Override
	public int compareTo (Object o) {
	ArmoredTitan x = (ArmoredTitan) o;
	return this.distanceFromBase - x.distanceFromBase;
	}
	
}
