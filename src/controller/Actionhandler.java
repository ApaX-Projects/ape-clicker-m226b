package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.view.GameView;

public class Actionhandler implements ActionListener
{
	
	TimerC timer;
		/**
		 * actionPerformed method when user clicked either, the ape or one of the upgrades
		 */
		public void actionPerformed(ActionEvent action)
		{
			String act = action.getActionCommand();
			
			switch(act)
			{
			case("ape"):
				GameView.sc.addScore(1.0);
				String totalPoints = String.format("%.1f", GameView.sc.getScore());
				
				GameView.labelCount.setText(totalPoints + " Points");
				break;
			case("katta"):
				if(GameView.sc.score >= GameView.up1.cost)
				{
					
					GameView.sc.score -= GameView.up1.cost;
					GameView.perSec += GameView.up1.efficiency;
					GameView.up1.buyUpgrade();
					totalPoints = String.format("%.1f", GameView.sc.getScore());
					GameView.labelCount.setText(totalPoints + " Points");
					TimerC.timerUpd();
				}
				else
				{
					break;
				}
			case("orangutan"):
				if(GameView.sc.score >= GameView.up2.cost)
				{
					GameView.sc.score -= GameView.up2.cost;
					GameView.perSec += GameView.up2.efficiency;
					GameView.up2.buyUpgrade();
					totalPoints = String.format("%.1f", GameView.sc.getScore());
					GameView.labelCount.setText(totalPoints + " Points");
					TimerC.timerUpd();
				}
				else
				{
					break;
				}
			case("gorilla"):
				if(GameView.sc.score >= GameView.up3.cost)
				{
					GameView.sc.score -= GameView.up3.cost;
					GameView.perSec += GameView.up3.efficiency;
					GameView.up3.buyUpgrade();
					totalPoints = String.format("%.1f", GameView.sc.getScore());
					GameView.labelCount.setText(totalPoints + " Points");
					TimerC.timerUpd();
				}
				else
				{
					break;
				}
			case("king"):
				if(GameView.sc.score >= GameView.up4.cost)
				{
					GameView.sc.score -= GameView.up4.cost;
					GameView.perSec += GameView.up4.efficiency;
					GameView.up4.buyUpgrade();
					totalPoints = String.format("%.1f", GameView.sc.getScore());
					GameView.labelCount.setText(totalPoints + " Points");
					TimerC.timerUpd();
				}
				else
				{
					break;
				}
			}
		}
	}

