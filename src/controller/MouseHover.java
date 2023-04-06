package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import model.view.GameView;

public class MouseHover implements MouseListener
{
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Creates the Action executed when the user / player hovers over an upgrade
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		
		if(button == GameView.button1)
		{
			GameView.message.setText("Katta\n[Price: " + GameView.up1.getCost() + "]\nAutoclicks once every 10 seconds.");
		} else if(button == GameView.button2)
		{
			GameView.message.setText("Orangutan\n[Price: " + GameView.up2.getCost() + "]\nGives 5 Points every Second.");
		} else if (button == GameView.button3)
		{
			GameView.message.setText("Gorilla\n[Price: " + GameView.up3.getCost() + "]\nGives 25 Points every Second.");
		} else if(button == GameView.button4)
		{
			GameView.message.setText("King Kong\n[Price: " + GameView.up4.getCost() + "]\nGives 75 Points every Second.");
		}
	}
	
/**
 * Creates the Action executed when the user / player does not hover over an upgrade
 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
JButton button = (JButton)e.getSource();
		
		if(button == GameView.button1)
		{
			GameView.message.setText(null);
		} else if(button == GameView.button2)
		{
			GameView.message.setText(null);
		} else if (button == GameView.button3)
		{
			GameView.message.setText(null);
		} else if(button == GameView.button4)
		{
			GameView.message.setText(null);
		}
	}
}
