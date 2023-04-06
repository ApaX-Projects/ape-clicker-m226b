package model.upgrades;

public class UpgradeOne extends Upgrades implements UpgradesInterface
{

	/**
	 * ctor Constructor of the first Upgrade which is the cheapest but also not really effective
	 */
	public UpgradeOne()
	{
		cost = 15.0;
		efficiency = 0.1;
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
