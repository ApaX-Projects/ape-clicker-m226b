package model.upgrades;

public class UpgradeTwo extends Upgrades implements UpgradesInterface
{
	
	/**
	 * ctor Constructor which defines the specifications of the Second Upgrade
	 */
	public UpgradeTwo()
	{
		cost = 100.0;
		efficiency = 5.0;
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
