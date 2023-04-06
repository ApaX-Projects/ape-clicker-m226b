package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.upgrades.UpgradeOne;

public class TestUpgradeOne
{

	private UpgradeOne upgrade;
	
	@Before
	public void setUp() {
		
		upgrade = new UpgradeOne(); // Instances a new UpgradeOne Object called upgrade
		
	}
		
		@Test
		public void testBuyUpgrade() {
			upgrade.buyUpgrade(); // Buys an upgrade
			assertEquals(1, upgrade.getLevel()); // Checks if the level increased correctly
			assertEquals(17.25, upgrade.getCost(), 0.01); // Checks if the cost for the next upgrade increased by 15%
			
			upgrade.buyUpgrade(); // Buys an upgrade
			assertEquals(2, upgrade.getLevel()); // Added another level and checked its total
			assertEquals(19.84, upgrade.getCost(), 0.01); // Checks if it increases by another 15% correctly
		}
		
		@Test
		public void testUpgradeCost() {
			assertEquals(15.0, upgrade.getCost(), 0.01); // Checks the correct starting cost
		}
		
		@Test
		public void testUpgradeLevel() {
			assertEquals(0, upgrade.getLevel()); // Checks the correct starting level
		}
	}


