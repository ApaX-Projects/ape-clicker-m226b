package test;

import static org.junit.Assert.*;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.junit.Before;
import org.junit.Test;

import controller.MouseHover;
import model.upgrades.UpgradeOne;
import model.upgrades.UpgradeThree;
import model.upgrades.UpgradeTwo;
import model.view.GameView;

public class TestMouseHover {
	
	@Test
	public void testMouseEnteredButton1() {
	    // set up
	    MouseHover mouseHover = new MouseHover();
	    GameView.button1 = new JButton();
	    GameView.up1 = new UpgradeOne();
	    GameView.message = new JTextArea();

	    // action
	    mouseHover.mouseEntered(new MouseEvent(GameView.button1, MouseEvent.MOUSE_ENTERED, 0, 0, 0, 0, 0, false));

	    // assertion
	    assertEquals("Katta\n[Price: 15.0]\nAutoclicks once every 10 seconds.", GameView.message.getText());
	}
	@Test
	public void testMouseEnteredButton2() {
	    // set up
	    MouseHover mouseHover = new MouseHover();
	    GameView.button2 = new JButton();
	    GameView.up2 = new UpgradeTwo();
	    GameView.message = new JTextArea();

	    // action
	    mouseHover.mouseEntered(new MouseEvent(GameView.button2, MouseEvent.MOUSE_ENTERED, 0, 0, 0, 0, 0, false));

	    // assertion
	    assertEquals("Orangutan\n[Price: 100.0]\nGives 5 Points every Second.", GameView.message.getText());
	}
	@Test
	public void testMouseExitedButton3() {
	    // set up
	    MouseHover mouseHover = new MouseHover(); // Creates a new MouseHover object
	    GameView.button3 = new JButton(); // Creates the button3 (Labeled as Orangutan in the Game)
	    GameView.up3 = new UpgradeThree(); // Creates the Upgrade Object for the Orangutan
	    GameView.message = new JTextArea(); // Creates the Text Area which shows the description of the Orangutan
	    GameView.message.setText("Gorilla\n[Price: 100.0]\nGives 25 Points every Second."); // Sets the Orangutan description

	    // action
	    mouseHover.mouseExited(new MouseEvent(GameView.button3, MouseEvent.MOUSE_EXITED, 0, 0, 0, 0, 0, false));
	    // Simulates the hovering away from the Orangutan button

	    // assertion
	    assertEquals("", GameView.message.getText());
	}
}
