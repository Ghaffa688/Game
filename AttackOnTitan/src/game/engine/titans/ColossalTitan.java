package game.engine.titans;

public class ColossalTitan extends Titan {
	
	public int TITAN_CODE () {
		return 4;
	}
	
	public ColossalTitan (int baseHealth, int baseDamage, int heightInMeters, 
	int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		super (baseHealth, baseDamage, heightInMeters, 
		distanceFromBase, speed, resourcesValue, dangerLevel);
	}
	
	@Override
	public int compareTo (Object o) {
	ColossalTitan x = (ColossalTitan) o;
	return this.distanceFromBase - x.distanceFromBase;
	}

}
