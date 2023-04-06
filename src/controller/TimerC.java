package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import model.view.GameView;

public class TimerC
{
	static Timer timer;
	public static boolean timerState;
	
	/**
	 * ctor Instances a new Object of Timer, which performs the action every second
	 */
	public static void newTimer()
	{
		timer = new Timer(1000, new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						GameView.sc.addScore(GameView.perSec);
						
						String totalPoints = String.format("%.1f", GameView.sc.getScore());
						
						GameView.labelCount.setText(totalPoints + " Points");
						
						
					}
			
				});
	}
	
	/**
	 * Updates the earlier created Timer when called
	 */
	public static void timerUpd()
	{
		if(timerState == false)
		{
			timerState = true;
		}
		else if(timerState == true)
		{
			timer.stop();
		}
		
		String decimal = String.format("%.1f", GameView.perSec);
		
		GameView.labelPerSecond.setText("per Second: " + decimal);
		
		newTimer();
		timer.start();
		
		
	}
}
