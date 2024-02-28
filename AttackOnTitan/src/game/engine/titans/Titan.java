package game.engine.titans;

public abstract class Titan implements Comparable {

	public abstract int TITAN_CODE();
	
	protected int baseHealth;
	public int getBaseHealth() {
		return baseHealth;
	}

	
	protected int currentHealth = baseHealth;
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	
	protected int baseDamage;
	public int getBaseDamage() {
		return baseDamage;
	}

	
	protected final int heightInMeters;
	public int getHeightInMeters() {
		return heightInMeters;
	}

	
	protected int distanceFromBase;
	public int getDistanceFromBase() {
		return distanceFromBase;
	}
	public void setDistanceFromBase(int distanceFromBase) {
		this.distanceFromBase = distanceFromBase;
	}

	
	protected int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	protected int resourcesValue;
	public int getResourcesValue() {
		return resourcesValue;
	}
	

	protected final int dangerLevel;
	public int getDangerLevel() {
		return dangerLevel;
	}

	
	Titan (int baseHealth, int baseDamage, int heightInMeters, 
		int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		
		this.baseHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters =  heightInMeters;
		this.distanceFromBase = distanceFromBase;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;
		
	}
	
	public int compareTo (Titan o) {
		return this.distanceFromBase - o.distanceFromBase;
	}
	
}
