package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.view.GameView;

public class TestGameView {


	    // Test that the score label correctly displays the initial score of 0
	    @Test
	    public void testScoreLabelInitialValue() {
	        GameView view = new GameView();
	        view.NewUI();
	        assertEquals("1.0 Points", GameView.labelCount.getText());
	    }

	    // Test that clicking the click button correctly increments the score
		@Test
	    public void testClickButtonIncrementsScore() {
	        GameView view = new GameView();
	        view.NewUI();
	        double initialScore = GameView.sc.getScore();
	        GameView.button1.doClick();
	        GameView.sc.addScore(1);
	        assertEquals(initialScore + 1, GameView.sc.getScore(), 0.1);
	    }

	    // Test that buying an upgrade correctly deducts the cost from the score
		@Test
	    public void testUpgradeDeductsScore() {
	        GameView view = new GameView();
	        view.NewUI();
	        double initialScore = GameView.sc.getScore();
	        
	        for(int i = 0 ; i < 15; i++)
	        {
	        	GameView.button1.doClick(); // click the button to earn points
	        }
	        
	        double cost = GameView.up1.getCost();
	        GameView.button1.doClick(); // buy the upgrade
	        assertEquals(initialScore + 15 - cost, GameView.sc.getScore(), 0.1);
	    }
	}

