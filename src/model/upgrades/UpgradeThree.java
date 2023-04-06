package model.upgrades;

public class UpgradeThree extends Upgrades implements UpgradesInterface
{
	/**
	 * ctor Constructor for the second highest upgrade which is semi expensive but also not the most efficient one
	 */
	public UpgradeThree()
	{
		cost = 500.0;
		efficiency = 25.0;
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
