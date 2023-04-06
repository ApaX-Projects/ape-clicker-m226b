package model.upgrades;

public class UpgradeFour extends Upgrades implements UpgradesInterface{

	/**
	 * ctor Constructor of the last upgrade which is the most expensive but also most efficient
	 */
	public UpgradeFour()
	{
		cost = 1000.0;
		efficiency = 75.0;
		level = 0;
	}

	/**
	 * Adds one level to the total of the upgrade and increases its cost by 15%
	 */
	@Override
	public void buyUpgrade()
	{
		addLevel();
		cost *= 1.15;
	}

}
