package controller;


import model.view.GameView;

public class ClickerGame
{
	
	/**
	 * ctor The Main Method of the Game, which instances every earlier created object and Task
	 * @param args
	 * @author seyaw
	 */

	public static void main(String[] args)
	{		
		GameView gv = new GameView();
		TimerC.timerState = false;
		
		gv.CreateFont();
		gv.NewUI();
		TimerC.timerUpd();

	}

}
