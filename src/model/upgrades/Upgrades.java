package model.upgrades;

public class Upgrades
{
	
	public double cost;
	public double efficiency;
	public boolean Unlocked = false;
	public int level = 0;
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * @return the efficiency
	 */
	public double getEfficiency() {
		return efficiency;
	}
	/**
	 * @param efficiency the efficiency to set
	 */
	public void setEfficiency(double efficiency) {
		this.efficiency = (level * efficiency);
	}
	/**
	 * @return the isUnlocked
	 */
	public boolean isUnlocked()
	{
		if(level != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void addLevel() {
		
		this.level++;
	}
	
	
	
}
